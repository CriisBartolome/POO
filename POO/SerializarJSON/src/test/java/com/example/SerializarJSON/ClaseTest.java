package com.example.SerializarJSON;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class ClaseTest {

    @Test
    //En este test estamos creando un objeto de la clase Clase
    //Después lo serializamos pasandolo a formato JSON
    public void serializarObjetoJSON() throws Exception{
        Clase clase = new Clase("Hola", 4, "Mundo", 7);
        ObjectMapper oM = new ObjectMapper();
        String valor = oM.writeValueAsString(clase);
        System.out.println(valor);       
    }
    
    //En este test, tenemos un archivo JSON en la ruta especificada
    //Lo que queremos hacer es construir el objeto a partir del JSON
    @Test
    public void deserializarObjetoJSON() throws Exception{
        ObjectMapper oM = new ObjectMapper();
        String valor = Files.readString(Paths.get("src/main/resources/Datos.json"));
        System.out.println(valor);
        Clase claseLeida = oM.readValue(valor, Clase.class);
        System.out.println(claseLeida);
    }

}
