package Persona;

class Empleados extends Personas{

	protected int horaIngreso;
	protected int horaSalida;
	protected String puesto;
	protected double sueldo;
	protected String estado;
			
	public Empleados(int id, String nombre, String apellido, String sexo, String cedula, String telefono, String correo, String direccion, int horaIngreso, int horaSalida, String puesto, double sueldo, String estado) {
		super(id, nombre, apellido,sexo , cedula , telefono , correo , direccion);
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
		this.puesto = puesto;
		this.sueldo = sueldo;
		this.estado = estado;
	}
		
		int getHoraIngreso() {
	    	return horaIngreso;
		}
		
	    void setHoraIngreso (int horaIngreso) {
	    	this.horaIngreso = horaIngreso;
	    }
	    
	    int getHoraSalida() {
	    	return horaSalida;
	    }
	    
	    void setHoraSalida (int horaSalida) {
	    	this.horaSalida = horaSalida;
	    }
	    
	    String getPuesto() {
	    	return puesto;
	    }
	    
	    void setPuesto (String puesto) {
	    	this.puesto = puesto;
	    }
	    
	    double getSueldo() {
	    	return sueldo;
	    }
	    
	    void setSueldo (double sueldo) {
	    	this.sueldo = sueldo;
	    }
	    
	    String getEstado() {
	    	return estado;
	    }
	    
	    void SetEstado(String estado) {
	    	this.estado = estado;
	    }
}