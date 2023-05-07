/*
    Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
    conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    los servicios en la clase correspondiente)
    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    cómo se ordena un conjunto.
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    al usuario.
*/
package ejercicio_5;

import entidad.Paises;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Paises paises = new Paises();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String pais;

        System.out.println("Bienvenido a TuPais");
        do{
            System.out.println("Elija una opción");
            System.out.println("1)- Crear Pais");
            System.out.println("2)- Mostrar Paises");
            System.out.println("3)- Eliminar Paises");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch(opcion){
                case 1: {
                    System.out.println("Ingresá Pais");
                    pais = entrada.next();
                    paises.agregarPais(pais);
                    System.out.println("¿Quiere seguir agregando paises?");
                    System.out.println("1)- Si");
                    System.out.println("2)- No");
                    opcion = entrada.nextInt();
                    entrada.nextLine();
                    if(opcion == 1){
                        System.out.println("Ingresá el pais");
                        pais = entrada.next();
                        paises.agregarPais(pais);
                    }
                    System.out.println("");
                    break;
                }
                case 2: {
                    if(paises.cantidadPaises() != 0){
                        paises.mostrarPaises();
                    }else {
                        System.out.println("Primero debería agregar un pais");
                    }
                    System.out.println("");
                    break;
                }
                case 3: {
                    if(paises.cantidadPaises() != 0){
                        System.out.println("Ingresa el pais a eliminar");
                        pais = entrada.next();
                        paises.eliminarPais(pais);
                    }else {
                        System.out.println("Primero debería agregar un pais");
                    }
                    System.out.println("");
                    break;
                }
            }
        }while(opcion != 0);
        System.out.println("Gracias por utilizar TuPais");
    }
}
