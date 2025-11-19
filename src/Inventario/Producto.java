package Inventario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;
    private String fechasReabastecimiento;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechasReabastecimiento = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechasReabastecimiento() {
        return fechasReabastecimiento;
    }

    public void setFechasReabastecimiento(String fechasReabastecimiento) {
        this.fechasReabastecimiento = fechasReabastecimiento;
    }

    public  void descripcion(){

    }


    public void reabastecer(int cantidad,String fecha){
       this.cantidad+=cantidad;
       this.fechasReabastecimiento=fecha;

    }
    public void despacharProdcutos(int cantidad){
        this.cantidad-=cantidad;
    }









}
