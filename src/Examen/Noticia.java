package Examen;

import java.util.Calendar;

public class Noticia {
    private Calendar fecha;
    private String texto;

    public Noticia(Calendar fecha, String texto) {
        this.fecha = fecha;
        this.texto = texto;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getTexto() {
        return texto;
    }

    public String publica() {
        return this.texto;
    }
}
