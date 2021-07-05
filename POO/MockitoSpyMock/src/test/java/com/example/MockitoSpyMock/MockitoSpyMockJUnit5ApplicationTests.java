package com.example.MockitoSpyMock;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MockitoSpyMockJUnit5ApplicationTests {

    @Mock
    List<Integer> mockLista;

    @Test
    void usoDeMock() {
        mockLista.add(1);
        System.out.println(mockLista.size());
        Mockito.verify(mockLista).add(1);
        assertEquals(0, mockLista.size());

        Mockito.when(mockLista.size()).thenReturn(100);
        System.out.println(mockLista.size());
        assertEquals(100, mockLista.size());
    }
    
    @Spy
    // Si no usamos la anotación, funciona igual si escribimos
    // List<String> spyLista = Mockito.spy(new ArrayList<String>());
    // dentro del método de prueba
    List<String> spyLista = new ArrayList<String>();

    @Test
    void usoDeSpy() {
        spyLista.add("Elemento 1");
        spyLista.add("Elemento 2");
        System.out.println(spyLista.size());

        Mockito.verify(spyLista).add("Elemento 1");
        Mockito.verify(spyLista).add("Elemento 2");

        assertEquals(2, spyLista.size());

        Mockito.doReturn(100).when(spyLista).size();
        System.out.println(spyLista.size());
        assertEquals(100, spyLista.size());
    }

}
