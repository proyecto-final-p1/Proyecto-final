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
        
        String getPresentacion() {
        	return presentacion;
        }
        
        String getDescripcion() {
        	return descripcion;
        }
        
        String getConcentracion() {
        	return concentracion;
        }
        
        int getStock() {
        	return stock;
        }
        
        double getCosto() {
        	return costo;
        }
        
        double getVenta() {
        	return venta;
        }
        
        int getVencimiento() {
        	return vencimiento;
        }
               
        String getRegistro_Sanitario() {
        	return registro_Sanitario;
        }
        
        String getLaboratorio() {
        	return laboratorio;
        }
        
        String getEstado() {
        	return estado;
        }
}
