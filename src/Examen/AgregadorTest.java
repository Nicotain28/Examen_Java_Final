package Examen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgregadorTest {

    @Test
    void enviaSuscripciones() {
        Usuario usuario = new Usuario("Willy", "Willyrex", "willy@gmail.com");
        Mensual mensual = new Mensual(usuario, 12, 21);
        Noticia noticia = new Noticia(Calendar.getInstance(), "textito");
        List<Noticia> noticias =new ArrayList<>();
        noticias.add(noticia);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.MONTH, -4);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.MONTH, +4);
        Agregador agregador = new Agregador();
        agregador.addSuscripciones(mensual);
        agregador.addNoticias(noticia);
        agregador.enviaSuscripciones();
        assertEquals(agregador.noticias(calendar1,calendar2), noticias);
        assertEquals("11", mensual.getDuracion());
    }

    @Test
    void noticias() {
    }
}