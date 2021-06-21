package Examen;

import java.util.Calendar;

public class Mensual implements Suscripcion{
    private Usuario usuario;
    private int duracion;
    private int dia;

    public Mensual(Usuario usuario, int duracion, int dia){
        this.usuario = usuario;
        this.duracion = duracion;
        this.dia = dia;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public boolean activa(Calendar fecha) {
        if (fecha.get(Calendar.DAY_OF_MONTH) == this.dia){
            duracion --;
            return true;
        }
        return false;
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
