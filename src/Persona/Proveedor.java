package Persona;

public class Proveedor extends Personas{
	
	protected String rnc;
	protected String banco;
	protected String cuenta;
	protected String estado;
	
	
    public Proveedor(int id, String nombre, String apellido, String sexo, String cedula, String telefono, String correo, String direccion, String rnc, String banco, String cuenta, String estado) {
		super(id, nombre, apellido, sexo, cedula, telefono, correo, direccion);
		this.rnc = rnc;
		this.banco = banco;
		this.banco = banco;
		this.estado = estado;
    }

    
    public String getRNC() {
        return rnc;
    }
    
    void setRNC(String rnc) {
    	this.rnc = rnc;
    }
    
    public String getBanco() {
        return banco;
    }
    
    void setBanco(String banco) {
    	this.banco = banco;
    }
    
    public String getCuenta() {
        return cuenta;
    }
    
    void setCuenta(String cuenta) {
    	this.cuenta = cuenta;
    }
    
    public String getEstado() {
        return estado;
    }
    
    void setEstado(String estado) {
    	this.estado = estado;
    }
    
}