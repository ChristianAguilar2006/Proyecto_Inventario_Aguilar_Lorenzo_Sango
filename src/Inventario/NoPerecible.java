package Inventario;

public class Freno extends Producto {
    private String categoria;
    private String material;

    public Freno(String nombre, double precio, int cantidad, String categoria, String material) {
        super(nombre, precio, cantidad);
        this.categoria = categoria;
        this.material = material;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void descripcion(){
        System.out.println("NOMBRE: "+this.getNombre()+" PRECIO: "+this.getPrecio()+" CANTIDAD: "+this.getCantidad()+" CATEGORIA: "+this.categoria+" MATERIAL: "+this.material);
    }


}
