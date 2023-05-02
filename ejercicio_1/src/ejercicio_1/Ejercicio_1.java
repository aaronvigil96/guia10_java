package ejercicio_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        ArrayList<String> perros = new ArrayList<>();

        do{
            System.out.println("¿Que quiere hacer?");
            System.out.println("1)- Ingresar raza de perro");
            System.out.println("2)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    System.out.print("raza: ");
                    perros.add(entrada.next());
                    break;
                }
                case 2: {
                    break;
                }
            }
        }while(opcion != 2);
        System.out.println("Ingresa la raza a eliminar: ");
        String raza = entrada.next();
        Iterator<String> iterator = perros.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(raza)){
                iterator.remove();
                System.out.println("Se elimino correctamente la raza: " + raza);
            }else if(iterator.hasNext() == false){
                System.out.println("No se encontró esa raza");
            }
        }
        TreeSet<String> razaPerros = new TreeSet(perros);
        for(String razaPerro : razaPerros){
            System.out.println(razaPerro);
        }
    }
}
