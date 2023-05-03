/*
    Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
    alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
    con sus 3 notas.
    En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    pregunta al usuario si quiere crear otro Alumno o no.
    Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main.
*/
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Alumno crearAlumno(){
        int vueltas = 0;
        Alumno alumno = new Alumno();
        System.out.println("Ingresá el nombre: ");
        alumno.setNombre(entrada.next());
        while(vueltas < 3){
            System.out.println("Ingresá la nota " + (vueltas + 1));
            alumno.ingresarNota();
            vueltas++;
        }
        return alumno;
    }
    
    public void iniciarAplicacion(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String nombre;
        boolean estado = false;
        int opcion;
        do{
            System.out.println("¿Quiere agregar un alumno?");
            System.out.println("1)- Si");
            System.out.println("2)- No");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    alumnos.add(crearAlumno());
                    break;
                }
                case 2: {
                    break;
                }
            }
        }while(opcion != 2);
        System.out.println("¿De que alumno quiere calcular el promedio?");
        nombre = entrada.next();
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equals(nombre)){
                System.out.println("El promedio de " + alumno.getNombre() + " es: " + alumno.calcularPromedio());
                estado = true;
            }
        }
        if(!estado){
            System.out.println("No se encontró el alumno " + nombre);
        }
    }
}
