package Inventario;

public class NoPerecible extends Producto {

    private String porcentajeDePreservantes;
    private String tipoDeAlmacenamiento;

    public NoPerecible(String nombre, double precio, int cantidad, String fechasReabastecimiento, String fechaDeEntrega, String porcentajeDePreservantes, String tipoDeAlmacenamiento) {
        super(nombre, precio, cantidad);
        this.porcentajeDePreservantes = "";
        this.tipoDeAlmacenamiento = "";
    }

    public String getPorcentajeDePreservantes() {
        return porcentajeDePreservantes;
    }

    public void setPorcentajeDePreservantes(String porcentajeDePreservantes) {
        this.porcentajeDePreservantes = porcentajeDePreservantes;
    }

    public String getTipoDeAlmacenamiento() {
        return tipoDeAlmacenamiento;
    }

    public void setTipoDeAlmacenamiento(String tipoDeAlmacenamiento) {
        this.tipoDeAlmacenamiento = tipoDeAlmacenamiento;
    }

    public void descripcion(){
        System.out.println("NOMBRE: "+this.getNombre()+"| PRECIO: "+this.getPrecio()+"| CANTIDAD: "+this.getCantidad()+"| CANTIDAD DE PRESERVANTES (%): "+this.porcentajeDePreservantes+"| TIPO DE ALMACENAMIENTO: "+this.tipoDeAlmacenamiento);
 }


}
