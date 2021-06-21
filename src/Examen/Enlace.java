package Examen;

import java.util.Calendar;

public class Enlace extends Noticia{
private String url;

    public Enlace(Calendar fecha, String texto, String url) {
        super(fecha, texto);
        this.url = url;
    }

    @Override
    public String publica() {
        return getTexto() + ", url= " + this.url;
    }
}
