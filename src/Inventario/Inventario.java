package Inventario;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Scanner;

public class Inventario  {

    private List<Producto>productos;
    private double presupuestoInicial;


    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getPresupuestoInicial() {
        return presupuestoInicial;
    }

    public void setPresupuestoInicial(double presupuestoInicial) {
        this.presupuestoInicial = presupuestoInicial;
    }


    public void agragarproducto(Producto producto) {
        if (producto.getPrecio() * producto.getCantidad() > presupuestoInicial) {
            System.out.println("NO TIENE PRESUPUESTO PARA AGREGAR LA CANTIDAD DE ESTE PRODUCTO");

        } else {
            productos.add(producto);
            this.presupuestoInicial=this.presupuestoInicial-(producto.getCantidad()*producto.getPrecio());
        }
    }

    public void verProductos(){
        System.out.println("PRESUPUESTO: "+this.presupuestoInicial);
        for(Producto producto:productos){
            producto.descripcion();
        }
    }

    public void reabastecerProducto(String nombreP,int cantidad,String fecha) {
    Scanner scanner=new Scanner(System.in);
      for (Producto producto:productos){
            if (producto.getNombre().equalsIgnoreCase(nombreP)){
                if ((cantidad*producto.getPrecio())>this.presupuestoInicial){
                    System.out.println("PRESUPUESTO NO ALCANZADO");
                    return;
                }
                System.out.println("PRODUCTO REABASTECIDO");
                producto.reabastecer(cantidad,fecha);


            }
        }
    }
    public void editarProducto(String nombre){
         Scanner scanner=new Scanner(System.in);
        for (Producto producto: productos){
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("PRODUCTO ENCONTRADO");
                System.out.println("INGRESE EL NUEVO NOMBRE");
                producto.setNombre(scanner.nextLine());
                System.out.println("INGRESE LA CANTIDAD");
                producto.setCantidad(scanner.nextInt());
                scanner.nextLine();
                System.out.println("INGRESE EL NUEVO PRECIO");
                producto.setPrecio(scanner.nextDouble());
                System.out.println("EDITADO CORRECTAMENTE");
                System.out.println("*********");
                producto.descripcion();
            }
        }
    }

    public void eliminar(String eliminar) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(eliminar)) {
                productos.remove(i);
                System.out.println("PRODUCTO ELIMINADO........");
                return;
            }
        }
    }

    public void fechasReabastecieminto(){
        for (Producto producto:productos){
            System.out.println("PRODUCTO: "+producto.getNombre()+" ULTIMA FECHA DE ABASTECIEMIENTO: "+producto.getFechasReabastecimiento());
        }
    }

    public void despacho(String nombre,int cantidad){

        for (Producto producto:productos){
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                var precioFinal=producto.getPrecio()*cantidad;
                producto.despacharProdcutos(cantidad);
            }
        }
    }







}
