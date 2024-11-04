package es.santander.ascender;


import org.junit.jupiter.api.Test;

public class PepeTest {
@Test
    public void testSumar () {
        Pepe sut = new Pepe ();
        assertTrue(sut.sumar(4, 3) ==7);
    }
} 
        