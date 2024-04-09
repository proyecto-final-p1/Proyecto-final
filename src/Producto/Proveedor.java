package Producto;

public class Proveedor extends Productos {
    private String proveedorNombre;
    private String proveedorContacto;

    Proveedor(int id, String presentacion, String descripcion, String concentracion, int stock, double costo, double venta, int vencimiento, String registro_Sanitario, String laboratorio, String estado, String proveedorNombre, String proveedorContacto) {
        super(id, presentacion, descripcion, concentracion, stock, costo, venta, vencimiento, registro_Sanitario, laboratorio, estado);
        this.proveedorNombre = proveedorNombre;
        this.proveedorContacto = proveedorContacto;
    }

    
    public String getProveedorNombre() {
        return proveedorNombre;
    }

    public String getProveedorContacto() {
        return proveedorContacto;
    }

    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }

    public void setProveedorContacto(String proveedorContacto) {
        this.proveedorContacto = proveedorContacto;
    }

   
}