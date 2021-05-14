package com.example.SerializarJSON;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class ClaseArrayTest {
    
    Alumno [] arrayAlumnos = new Alumno[2];
    
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
        ClaseArray claseArray = new ClaseArray("valor1", 2, "valor2", 4, arrayAlumnos);
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
        ClaseArray claseLeida = oM.readValue(valor, ClaseArray.class);
        System.out.println(claseLeida);
    }

}
