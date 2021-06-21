package Examen;

import java.util.Calendar;

public interface Suscripcion {
    boolean activa(Calendar fecha);
    Usuario getUsuario();
    void setUsuario(Usuario usuario);
}
