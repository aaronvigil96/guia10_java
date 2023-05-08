/*
    Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
package ejercicio_6;

import entidad.Almacen;
import java.util.Scanner;
import servicio.AlmacenServicio;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AlmacenServicio as = new AlmacenServicio();
        Almacen almacen = as.crearAlmacen();
        int opcion;
        
        System.out.println("Bienvenido a TuTienda");
        do{
            System.out.println("1)- Agregar Producto");
            System.out.println("2)- Modificar Precio Producto");
            System.out.println("3)- Eliminar producto");
            System.out.println("4)- Mostrar productos");
            System.out.println("0)- Salir");
            
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch(opcion){
                case 1: {
                    as.ingresarProducto(almacen);
                    break;
                }
                case 2: {
                    as.modificarPrecio(almacen);
                    break;
                }
                case 3: {
                    as.eliminarProducto(almacen);
                    break;
                }
                case 4: {
                    as.mostrarProductos(almacen);
                    break;
                }
            }
        }while(opcion != 0);
    }
    
}
