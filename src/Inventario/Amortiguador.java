package Inventario;

public class Amortiguador extends Producto{

    private int pesoSoportado;

    public Amortiguador(String nombre, double precio, int cantidad, int pesoSoportado) {
        super(nombre, precio, cantidad);
        this.pesoSoportado = pesoSoportado;
    }

    public int getPesoSoportado() {
        return pesoSoportado;
    }

    public void setPesoSoportado(int pesoSoportado) {
        this.pesoSoportado = pesoSoportado;
    }

    public void descripcion(){
        System.out.println("NOMBRE: "+this.getNombre()+" PRECIO: "+this.getPrecio()+" CANTIDAD: "+this.getCantidad()+" PESO LIMITE SOPORTADO: "+this.pesoSoportado);
    }
}
