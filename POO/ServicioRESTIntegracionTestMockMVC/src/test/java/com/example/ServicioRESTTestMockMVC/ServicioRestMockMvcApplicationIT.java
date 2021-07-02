package com.example.ServicioRESTTestMockMVC;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

// Si queremos que levante la aplicación entera usamos
// @SpringBootTest y @AutoConfiguraMockMvc

// Si queremos levantar solo una parte de la aplicación, tenemos que poner 
// las anotaciones correspondientes que nos permitan dicha configuración
@WebMvcTest(ProductosController.class)
@AutoConfigureDataJpa
class ServicioRestMockMvcApplicationIT {

    @Autowired
    private MockMvc mvc;

    @Autowired
    ProductosRepository productosRepository;

    @BeforeEach
    void init() {
        Producto canica = new Producto("Canica", 1, 0.50, "Juegos");
        Producto camiseta = new Producto("Camiseta", 2, 12.95, "Ropa");

        productosRepository.save(canica);
        productosRepository.save(camiseta);
    }

    @Test
    public void getProductos() throws Exception {
        String json = "[{\"nombre\":\"Canica\",\"id\":1,\"precio\":0.5,\"categoria\":\"Juegos\"},{\"nombre\":\"Camiseta\",\"id\":2,\"precio\":12.95,\"categoria\":\"Ropa\"}]";
        mvc.perform(MockMvcRequestBuilders.get("/")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                // Es lo mismo que .andExpect(status().isOk())
                .andExpect(result -> assertEquals("Status", HttpStatus.OK.value(), result.getResponse().getStatus()))
                .andExpect(result -> assertEquals("Body", json, result.getResponse().getContentAsString()));
    }

    @Test
    public void postProductos() throws Exception {
        Producto cazadora = new Producto("Cazadora", 3, 29.95, "Ropa");
        ObjectMapper oMapper = new ObjectMapper();
        mvc.perform(MockMvcRequestBuilders.post("/")
                .content(oMapper.writeValueAsString(cazadora))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().string(oMapper.writeValueAsString(cazadora)));
    }

}
