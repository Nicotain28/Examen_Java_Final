package Examen;

import java.util.Calendar;

public class Video extends Noticia{
    private Long video_id;

    public Video(Calendar fecha, String texto, Long video_id) {
        super(fecha, texto);
        this.video_id = video_id;
    }

    public String publica() {
        return getTexto() + ", video_id= " + this.video_id;
    }
}
