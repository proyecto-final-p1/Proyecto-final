package Persona;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String usuario;
    protected int contraseña;
    protected String correo;

    public Persona(String nombre, String apellido, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }

}

