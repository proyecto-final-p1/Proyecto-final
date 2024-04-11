package Persona;

public class Usuarios extends Empleados{
	
	protected String usuario;
    protected int contraseña;

	public Usuarios(int id, String nombre, String apellido, String sexo, String cedula, String telefono, String correo, String direccion, int horaIngreso, int horaSalida, String puesto, double sueldo, String estado, String usuario, int contraseña) {
		super(id, nombre, apellido, sexo, cedula, telefono, correo,  direccion, horaIngreso, horaSalida, puesto, sueldo, estado);
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	
	String getUsuario() {
		return usuario;
	}
	
	void setUsuario (String usuario) {
    	this.usuario = usuario;
    }

	
	int getContraseña () {
		return contraseña;
	}
	
	void setContraseña (int contraseña) {
		this.contraseña = contraseña;
	}
	
	
	public void iniciarSesion(String usuario, int contraseña) {
    	if (this.usuario.equals(usuario) && this.contraseña == contraseña) {
    		System.out.println("Sesión iniciada correctamente para " + nombre + " " + apellido);
    	} else {
        	System.out.println("Error al iniciar sesión. Credenciales incorrectas.");
    	}
	}
}