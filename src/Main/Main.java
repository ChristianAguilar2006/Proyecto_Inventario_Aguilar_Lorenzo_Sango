package Main;
import Inventario.Inventario;
import Inventario.Freno;
import Inventario.Llanta;
import Inventario.Amortiguador;
import java.util.Scanner;


public class Main {

     private static Scanner scanner=new Scanner(System.in);
     private static Inventario inventario=new Inventario();

    public static void main(String[] args) {

        boolean seguir=true;
        while (seguir){

            var opcion=FuncionesDelMain.menu();
            scanner.nextLine();
            switch (opcion){

                case 1->{
                    FuncionesDelMain.ingresarPresupuesto();
                }
                case 2->{
                    FuncionesDelMain.agregarProducto();
                }
                case 3->{
                    FuncionesDelMain.verProductos();
                }
                case 4->{
                   FuncionesDelMain.editarProducto();
                }
                case 5->{
                    FuncionesDelMain.reabastecer();
                }
                case 6->{
                    FuncionesDelMain.eliminar();
                }
                case 7->{
                    FuncionesDelMain.fechasReabastecimiento();
                }
                case 8->{
                    FuncionesDelMain.despachar();
                }
                case 9->seguir=false;
            }
        }
    }

    class FuncionesDelMain{

        private static int menu(){
            System.out.println("1) INGRESAR PRESUPUESTO");
            System.out.println("2) AGREGAR PRODUCTO");
            System.out.println("3) VER PRODUCTOS");
            System.out.println("4) EDITAR PRODCUTO");
            System.out.println("5) REABASTECER PRODUCTO");
            System.out.println("6) ELIMINAR PRODUCTO");
            System.out.println("7) FECHAS REABASTECIMIENTO");
            System.out.println("8) DESPACHAR PRODUCTO");
            System.out.println("9) salir");
            var opc=scanner.nextInt();
            return opc;
        }
        private static void ingresarPresupuesto(){
            System.out.println("INGRESE EL PRESUPUESTO");
            inventario.setPresupuestoInicial(scanner.nextDouble());
        }

        private static void agregarProducto(){
            System.out.println("QUE QUIERE AGREGAR: ");
            System.out.println("1) FRENOS");
            System.out.println("2) LLANTAS");
            System.out.println("3) AMORTIGUADORES");
            var opc1=scanner.nextInt();
            scanner.nextLine();
            System.out.println("INGRESE EL NOMBRE DE LA MARCA");
            var marca=scanner.nextLine();
            System.out.println("INGRESE LA CANTIDAD");
            var cantidad=scanner.nextInt();
            scanner.nextLine();
            System.out.println("INGRESE EL PRECIO");
            var precio=scanner.nextDouble();
            scanner.nextLine();
            switch (opc1){
                case 1->{
                    System.out.println("INGRESE LA CATEGORIA DISCO/TAMBOR");
                    var cat=scanner.nextLine();
                    System.out.println("INGRESE EL MATERIAL PRINCIPAL");
                    var material=scanner.nextLine();
                    var producto=new Freno(marca,precio,cantidad,cat,material);
                    inventario.agragarproducto(producto);
                }
                case 2->{
                    System.out.println("INGRESE EL RIN DE LA LLANTA");
                    var rin=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("INGRESE EL TIPO DE LABRADO LLANTA 4X4 /LISAS");
                    var tipo=scanner.nextLine();
                    var producto=new Llanta(marca,precio,cantidad,rin,tipo);
                    inventario.agragarproducto(producto);
                }
                case 3->{
                    System.out.println("INGRESE EL PESO SOPORTADO en KG");
                    var peso=scanner.nextInt();
                    var amortiguadir=new Amortiguador(marca,precio,cantidad,peso);
                    inventario.agragarproducto(amortiguadir);
                }
            }
        }
        private static void verProductos(){
            inventario.verProductos();
        }

        private static void editarProducto(){
            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
            var nombre=scanner.nextLine();
            inventario.editarProducto(nombre);
        }
        private static void reabastecer(){
            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
            var nombreP=scanner.nextLine();
            System.out.println("INGRESE LA CANTIDAD");
            var cantidad=scanner.nextInt();
            scanner.nextLine();
            System.out.println("INGRESE LA FECHA  DD/MM/AA");
            var fecha=scanner.nextLine();
            inventario.reabastecerProducto(nombreP,cantidad,fecha);
        }
        private static void eliminar(){
            System.out.println("INGRESE EL NOMBRE A ELIMINAR");
            var nombreAEliminar=scanner.nextLine();
            inventario.eliminar(nombreAEliminar);
        }
        private static void fechasReabastecimiento(){
            inventario.fechasReabastecieminto();
        }
        private static void despachar(){
            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
            var nombreP=scanner.nextLine();
            System.out.println("INGRESE LA CANTIDAD");
            var cantidad=scanner.nextInt();
            inventario.despacho(nombreP,cantidad);
        }

    }
}