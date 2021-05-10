package com.example.UsoAssertJ;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AssertJTest {

    List<Integer> listaEnteros;
    
    @Test
    void listaVacia() {
        assertThat(listaEnteros).isNull();       
        //assertNull(listaEnteros);
    }
    
    @Test
    void crearLista() {
        listaEnteros = new ArrayList<>();
        assertThat(listaEnteros).isNotNull();
        assertThat(listaEnteros.isEmpty()).isTrue();
        //assertNotNull(listaEnteros);
        
    }
    @Test
    void anadirValores() {
        listaEnteros = new ArrayList<>();
        listaEnteros.add(4);
        listaEnteros.add(7);
        listaEnteros.add(1);
        listaEnteros.add(6);
        assertThat(4).isEqualTo(listaEnteros.get(0));
        //assertEquals(4, listaEnteros.get(0));
        assertThat(7).isNotEqualTo(listaEnteros.get(0));
        //assertNotEquals(7, listaEnteros.get(0));
        assertThat(listaEnteros).doesNotContain(8);        
    }
    
    @Test
    void eliminarValores() {
        listaEnteros = new ArrayList<>();
        listaEnteros.add(4);
        listaEnteros.add(7);
        listaEnteros.add(1);
        listaEnteros.add(6);
        assertThat(listaEnteros).size().isEqualTo(4);
        //assertEquals(4, listaEnteros.size());
        listaEnteros.remove(0);
        assertThat(listaEnteros).size().isEqualTo(3);
        //assertEquals(4, listaEnteros.size());
        assertThat(listaEnteros).doesNotContain(4);
    }

}
