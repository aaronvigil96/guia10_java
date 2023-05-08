/*
    Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
package servicio;

import entidad.Almacen;
import java.util.Scanner;

public class AlmacenServicio {
    
    Scanner entrada = new Scanner(System.in);
    private String nombre;
    private Double precio;
    
   public Almacen crearAlmacen(){
       Almacen almacen = new Almacen();
       return almacen;
   }
   
   public void ingresarProducto(Almacen almacen){
       System.out.println("Ingresá el nombre del producto");
       this.nombre = entrada.next().toLowerCase();
       System.out.println("Ingresá el precio del producto");
       this.precio = entrada.nextDouble();
       entrada.nextLine();
       almacen.agregarProducto(nombre, precio);
       limpiarProducto();
   }
   
   public void modificarPrecio(Almacen almacen){
       System.out.println("Ingresá el nombre del producto");
       this.nombre = entrada.next();
       System.out.println("Ingresá el nuevo precio");
       this.precio = entrada.nextDouble();
       almacen.modificarProducto(nombre, precio);
       limpiarProducto();
   }
   
   public void eliminarProducto(Almacen almacen){
       System.out.println("Ingresá el nombre del producto");
       almacen.eliminarProducto(entrada.next());
       limpiarProducto();
   }
   
   public void mostrarProductos(Almacen almacen){
       almacen.mostrarProductos();
   }
   
   private void limpiarProducto(){
       this.nombre = "";
       this.precio = 0.0;
   }
}
