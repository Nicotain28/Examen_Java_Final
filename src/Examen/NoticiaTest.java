package Examen;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class NoticiaTest {

    @org.junit.jupiter.api.Test
    void publica() {
        Noticia noticia = new Noticia(Calendar.getInstance(), "textito");
        assertEquals("textito", noticia.publica());

    }
}