package servicio;

import entidad.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Pelicula crearPelicula(){
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingresá el titulo de la pélicula");
        pelicula.setTitulo(entrada.nextLine());
        System.out.println("Ingresá el director de la pélicula");
        pelicula.setDirector(entrada.nextLine());
        System.out.println("Ingresá la duración (minutos) de la pélicula");
        pelicula.setDuracion(entrada.nextInt());
        entrada.nextLine();
        return pelicula;
    }
}
