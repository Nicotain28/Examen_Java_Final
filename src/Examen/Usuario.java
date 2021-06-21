package Examen;

public class Usuario {
    private String nombre;
    private String login;
    private String email;

    public Usuario(String nombre, String login, String email) {
        this.nombre = nombre;
        this.login = login;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
