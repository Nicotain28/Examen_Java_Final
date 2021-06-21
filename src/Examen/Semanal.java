package Examen;

import java.util.Calendar;

public class Semanal implements Suscripcion{
    private Usuario usuario;
    private Calendar caducidad;
    private int dia;

    @Override
    public boolean activa(Calendar fecha) {
        return this.caducidad.after(fecha) & dia == fecha.get(Calendar.DAY_OF_WEEK);
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
