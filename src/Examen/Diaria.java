package Examen;

import java.util.Calendar;

public class Diaria implements Suscripcion{
    private Usuario usuario;
    private Calendar caducidad;

    public Diaria(Usuario usuario, Calendar caducidad) {
        this.usuario = usuario;
        this.caducidad = caducidad;
    }

    @Override
    public boolean activa(Calendar fecha) {
        return this.caducidad.after(fecha);
    }

    @Override
    public Usuario getUsuario() {
        return this.usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
