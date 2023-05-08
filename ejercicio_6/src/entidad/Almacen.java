/*
    Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
package entidad;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Almacen {
    private HashMap<String, Double> almacen;
    
    public Almacen(){
        this.almacen = new HashMap<>();
    }
    
    public void agregarProducto(String nombre, Double valor){
        if(this.almacen.put(nombre, valor) != null){
            System.out.println("El producto con ese nombre ya está agregado");
        }else {
            System.out.println("Producto creado con éxito");
        }
    }
    
    public void modificarProducto(String nombre, Double precio){
        boolean estado = false;
        Iterator<Map.Entry<String, Double>> entries = this.almacen.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, Double> entry = entries.next();
            if(entry.getKey().equals(nombre)){
                entry.setValue(precio);
                estado = true;
            }
        }
        if(estado){
            System.out.println("---------------------------");
            System.out.println("Precio modificado con éxito");
            System.out.println("---------------------------");
        }else {
            System.out.println("No se econtró el producto");
        }
    }
    
    public void eliminarProducto(String nombre){
        boolean estado = false;
        Iterator<Map.Entry<String, Double>> entries = this.almacen.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, Double> entry = entries.next();
            if(entry.getKey().equals(nombre)){
                this.almacen.remove(nombre);
                estado = true;
            }
        }
        if(estado){
            System.out.println("---------------------------");
            System.out.println("Producto ELIMINADO con éxito");
            System.out.println("---------------------------");
        }else {
            System.out.println("No se econtró el producto");
        }
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Double> entry : this.almacen.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " valor: " + entry.getValue());
        }
    }
}
