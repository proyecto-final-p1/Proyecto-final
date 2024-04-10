package Persona;

abstract class Personas {
    
	protected String nombre;
	protected String apellido;
	protected String sexo;
	protected String cedula;
	protected String telefono;
	protected String correo;
	protected String direccion;
    
    public Personas(String nombre, String apellido, String sexo, String cedula, String telefono,String correo,String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }
    
    String getnombre() {
    	return nombre;
    	}
    void setnombre (String nombre) {
    	this.nombre = nombre;
    }
    
    String getApellido () {
    	return apellido;
    }
    void setApellido (String apellido) {
    	this.apellido = apellido;
    }
    
    String getSexo() {
    	return sexo;
    	}
    void setSexo (String sexo) {
    	this.sexo = sexo;
    }
 
    String getCedula() {
    	return cedula;
    	}
    void setCedula (String cedula) {
    	this.cedula = cedula;
    }
    
    String getTelefono() {
    	return telefono;
    	}
    void setTelefono (String telefono) {
    	this.telefono = telefono;
    }
    
    String getCorreo() {
    	return correo;
    	}
    void setCorreo (String correo) {
    	this.correo = correo;
    }
    
    String getDireccion() {
    	return direccion;
    	}
    void setDireccion (String direccion) {
    	this.direccion = direccion;
    }
}

