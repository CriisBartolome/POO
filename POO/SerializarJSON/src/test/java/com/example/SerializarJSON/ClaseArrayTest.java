package com.example.SerializarJSON;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.json.JsonObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.joshka.junit.json.params.JsonFileSource;

class ClaseArrayTest {
    
    Alumno [] arrayAlumnos = new Alumno[2];
    ClaseArray claseArray;
    
    @BeforeEach
    void init(){
        Alumno alumno1 = new Alumno("Maria", "Lopez", 28, 123456);
        Alumno alumno2 = new Alumno("Carlos", "Jimenez", 19, 987654);
        arrayAlumnos[0] = alumno1;
        arrayAlumnos[1] = alumno2;
    }
    

    @Disabled
    @Test
    //En este test estamos creando un objeto de la clase Clase
    //Después lo serializamos pasandolo a formato JSON
    public void serializarObjetoJSON() throws Exception{
        claseArray = new ClaseArray("valor1", 2, "valor2", 4, arrayAlumnos);
        ObjectMapper oM = new ObjectMapper();
        File archivo = new File("src/main/resources/DatosArray.json");
        archivo.createNewFile();
        Files.writeString(archivo.toPath(), oM.writeValueAsString(claseArray), StandardOpenOption.APPEND);
        String valor = oM.writeValueAsString(claseArray);
        System.out.println(valor);       
    }
    
    //En este test, tenemos un archivo JSON en la ruta especificada
    //Lo que queremos hacer es construir el objeto a partir del JSON
    @Test
    public void deserializarObjetoJSON() throws Exception{
        ObjectMapper oM = new ObjectMapper();
        String valor = Files.readString(Paths.get("src/main/resources/DatosArray.json"));
        System.out.println(valor);
        claseArray = oM.readValue(valor, ClaseArray.class);
        System.out.println(claseArray);
    }
    
    @ParameterizedTest
    @JsonFileSource(resources = "/DatosArray.json")
    public void convertirAObjeto(JsonObject jsonObject) throws Exception{
        System.out.println(jsonObject.toString());
        System.out.println(jsonObject.getJsonArray("atributo5"));
        assertThat(jsonObject.getString("atributo1")).isEqualTo("valor1");
        
        ObjectMapper oM = new ObjectMapper();
        claseArray = oM.readValue(jsonObject.toString(), ClaseArray.class);
        System.out.println(claseArray);
        
        //assertThat(claseArray.getAtributo5().length).isEqualTo(arrayAlumnos.length);
        //assertThat(claseLeida.getAtributo5()).hasSameSizeAs(arrayAlumnos);
        assertThat(claseArray.getAtributo5()).usingFieldByFieldElementComparator()
                                             //.usingRecursiveFieldByFieldElementComparator()
                                             //.isEqualTo(arrayAlumnos)
                                             //.containsExactly(arrayAlumnos)
                                             .containsSequence(arrayAlumnos)
                                             .hasSameSizeAs(arrayAlumnos);     
    }

}
