package Persona;

class Empleados extends Personas{
	
	protected String usuario;
    protected int contraseña;
	
	public Empleados(String nombre, String apellido, String sexo, String cedula, String telefono,String correo,String direccion, String usuario, int contraseña) {
		super(nombre, apellido,sexo , cedula , telefono , correo , direccion);
		this.usuario = usuario;
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
