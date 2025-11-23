package Inventario;

public class Perecible extends Producto{

    private int diaUtilDias;
    private String fechaDeVencieminto;

    public Perecible(String nombre, double precio, int cantidad, String fechasReabastecimiento, String fechaDeEntrega, int diaUtilDias, String fechaDeVencieminto) {
        super(nombre, precio, cantidad);
        this.diaUtilDias = diaUtilDias;
        this.fechaDeVencieminto = fechaDeVencieminto;
    }

    public int getDiaUtilDias() {
        return diaUtilDias;
    }

    public void setDiaUtilDias(int diaUtilDias) {
        this.diaUtilDias = diaUtilDias;
    }

    public String getFechaDeVencieminto() {
        return fechaDeVencieminto;
    }

    public void setFechaDeVencieminto(String fechaDeVencieminto) {
        this.fechaDeVencieminto = fechaDeVencieminto;
    }

    public void descripcion(){
        System.out.println("NOMBRE: "+this.getNombre()+"| PRECIO: "+this.getPrecio()+"| CANTIDAD: "+this.getCantidad()+"| DIAS UTILES: "+this.diaUtilDias+"| FECHA DE CADUCIDAD: "+this.fechaDeVencieminto+"| ULTIMA FECHA QUE FUE ENTREGADO: "+this.getFechaDeEntrega());
    }
}
