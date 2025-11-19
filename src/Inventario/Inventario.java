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

      for (Producto producto:productos){
            if (producto.getNombre().equalsIgnoreCase(nombreP)){
                if ((cantidad*producto.getPrecio())>this.presupuestoInicial){
                    System.out.println("PRESUPUESTO NO ALCANZADO");
                    return;
                }
                System.out.println("PRODUCTO REABASTECIDO");
                producto.reabastecer(cantidad,fecha);
                this.presupuestoInicial=this.presupuestoInicial-(cantidad*producto.getPrecio());

            }
        }
    }
    public void editarProducto(String nombre){
        Scanner scanner = new Scanner(System.in);

        for (Producto p : productos){
            if (p.getNombre().equalsIgnoreCase(nombre)){

                double costoAnterior = p.getCantidad() * p.getPrecio();
                System.out.println("INGRESE EL NUEVO NOMBRE");
                String nuevoNombre = scanner.nextLine();

                System.out.println("INGRESE LA NUEVA CANTIDAD");
                int nuevaCantidad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("INGRESE EL NUEVO PRECIO");
                double nuevoPrecio = scanner.nextDouble();
                scanner.nextLine();

                double costoNuevo = nuevaCantidad * nuevoPrecio;
                double diferencia = costoNuevo - costoAnterior;

                if (diferencia > presupuestoInicial){
                    System.out.println("NO TIENE PRESUPUESTO");
                    return;
                }

                p.setNombre(nuevoNombre);
                p.setCantidad(nuevaCantidad);
                p.setPrecio(nuevoPrecio);
                presupuestoInicial -= diferencia;

                System.out.println("EDITADO");
                System.out.println("****");
                p.descripcion();
                System.out.println("****");
                return;
            }
        }

        System.out.println("NO ENCONTRADO");
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
                if (producto.getCantidad() < cantidad) {
                    System.out.println("NO HAY STOCK SUFICIENTE");
                    return;
                }
                producto.despacharProdcutos(cantidad);
                System.out.println("PRODUCTO DESPACHADO");
            }
        }
    }


}
