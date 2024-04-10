package Persona;

abstract class Personas {
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    String getNombre() {
    	return nombre;
    	}
    void setNombre (String nombre) {
    	this.nombre = nombre;
    }
    
    String getApellido () {
    	return apellido;
    }
    void setApellido (String apellido) {
    	this.apellido = apellido;
    }
    
    int getEdad() {
    	return edad;
    }
    void setEdad (int edad) {
    	this.edad = edad;
    }

}

