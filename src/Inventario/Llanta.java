package Inventario;

public class Llanta extends Producto{

    private int rin;
    private String labrado;

    public Llanta(String nombre, double precio, int cantidad, int rin, String labrado) {
        super(nombre, precio, cantidad);
        this.rin = rin;
        this.labrado = labrado;
    }

    public int getRin() {
        return rin;
    }

    public void setRin(int rin) {
        this.rin = rin;
    }

    public String getLabrado() {
        return labrado;
    }

    public void setLabrado(String labrado) {
        this.labrado = labrado;
    }

    public void descripcion(){
        System.out.println("NOMBRE: "+this.getNombre()+" PRECIO: "+this.getPrecio()+" CANTIDAD: "+this.getCantidad()+" CATEGORIA: "+this.rin+" TIPO: "+this.labrado);
    }
}
