package Producto;

public class Productos {
	
	private int id;
	private String presentacion;
	private String descripcion;
	private String concentracion;
	private int stock;
	private double costo;
	private double venta;
	private int vencimiento;
	private String registro_Sanitario;
	private String laboratorio;
	private String estado;
	
 
	Productos(int id, String presentacion, String descripcion, String concentracion, int stock, double costo, double venta, int vencimiento, String registro_Sanitario, String laboratorio, String estado) {
        this.id = id;
        this.presentacion = presentacion;
        this.descripcion = descripcion;
        this.concentracion = concentracion;
        this.stock = stock;
        this.costo = costo;
        this.venta = venta;
        this.vencimiento = vencimiento;
        this.registro_Sanitario = registro_Sanitario;
        this.laboratorio = laboratorio;
        this.estado = estado;
	}
        
        int getId() {
            return id;
        }
        
        void setID (int id) {
        	this.id = id;
        }
        
        String getPresentacion() {
        	return presentacion;
        }
        
        void setpPesentacion (String presentacion) {
        	this.presentacion = presentacion;
        }
        
        String getDescripcion() {
        	return descripcion;
        }
        
        void setDescripcion (String descripcion) {
        	this.descripcion = descripcion;
        }
        
        String getConcentracion() {
        	return concentracion;
        }
        
        void setConcentracion (String concentracion) {
        	this.concentracion = concentracion;
        }
        
        int getStock() {
        	return stock;
        }
        
        void setStock (int stock) {
        	this.stock = stock;
        }
        
        double getCosto() {
        	return costo;
        }
        
        void setCosto (double costo) {
        	this.costo = costo;
        }
        
        double getVenta() {
        	return venta;
        }
        
        void setVenta (double venta) {
        	this.venta = venta;
        }
        
        int getVencimiento() {
        	return vencimiento;
        }
        
        void setVencimiento (int vencimiento) {
        	this.vencimiento = vencimiento;
        }
               
        String getRegistro_Sanitario() {
        	return registro_Sanitario;
        }
        
        void setRegistro_Sanitario (String registro_Sanitario) {
        	this.registro_Sanitario = registro_Sanitario;
        }
        
        String getLaboratorio() {
        	return laboratorio;
        }
        
        void setLaboratorio (String laboratorio) {
        	this.laboratorio = laboratorio;
        }
        
        String getEstado() {
        	return estado;
        }
        
        void setEstado (String estado) {
        	this.estado = estado;
        }
}
