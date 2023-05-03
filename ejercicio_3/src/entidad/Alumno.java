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
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    
    Scanner entrada = new Scanner(System.in);
    
    //Atributos
    private String nombre;
    private ArrayList<Integer> notas;
    
    //Constructor
    public Alumno(){
        this.notas = new ArrayList<>();
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void ingresarNota(){
        int notaUsuario = entrada.nextInt();
        while(notaUsuario < 0 || notaUsuario > 10){
            System.out.println("Tiene que ingresar una nota mayor a 0 y menor a 10");
            notaUsuario = entrada.nextInt();
        }
        this.notas.add(notaUsuario);
    }
    public int calcularPromedio(){
        int total = 0;
        for (Integer nota : notas) {
            total = total + nota;
        }
        return total / 3;
    }
}
