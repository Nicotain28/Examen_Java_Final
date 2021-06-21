package Examen;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {

    @Test
    void publica() {
        Video noticia = new Video(Calendar.getInstance(), "textito", 25025L);
        assertEquals("textito, video_id= 25025", noticia.publica());
    }
}