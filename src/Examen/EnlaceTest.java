package Examen;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class EnlaceTest {

    @Test
    void publica() {
        Enlace noticia = new Enlace(Calendar.getInstance(), "textito", "www.google.com");
        assertEquals("textito, url= www.google.com", noticia.publica());
    }
}