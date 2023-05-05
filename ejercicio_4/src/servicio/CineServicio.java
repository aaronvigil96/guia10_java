package servicio;

import entidad.Cine;
import java.util.Scanner;

public class CineServicio {
    public void iniciarAplicacion(){
        Scanner entrada = new Scanner(System.in);
        Cine catalogo = new Cine();
        PeliculaServicio ps = new PeliculaServicio();
        int opcion;
        
        System.out.println("Bievenido a TuCine");
        do{
            System.out.println("1)- Crear Pelicula");
            System.out.println("2)- Mostrar Peliculas");
            System.out.println("3)- Mostrar Peliculas mayor a ...");
            System.out.println("4)- Mostrar y ordenar de acuerdo a su duracion (Asc)");
            System.out.println("5)- Mostrar y ordenar de acuerdo a su duracion (Desc)");
            System.out.println("6)- Mostrar y ordenar por titulo");
            System.out.println("7)- Mostrar y ordenar por director");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch(opcion){
                case 1: {
                    catalogo.agregarPelicula(ps.crearPelicula());
                    break;
                }
                case 2: {
                    if(catalogo.cantidadPeliculas() == 0){
                        System.out.println("Primero debería agregar alguna pelicula");
                        break;
                    }
                    catalogo.mostrarPeliculas();
                    break;
                }
                case 3: {
                    if(catalogo.cantidadPeliculas() == 0){
                        System.out.println("Primero debería agregar alguna pelicula");
                        break;
                    }
                    System.out.println("¿Mayor a qué duración?");
                    catalogo.mostrarPeliculasMayorA(entrada.nextInt());
                    entrada.nextLine();
                    break;
                }
                case 4: {
                    if(catalogo.cantidadPeliculas() == 0){
                        System.out.println("Primero debería agregar alguna pelicula");
                        break;
                    }
                    catalogo.ordenarPeliculasPorDuracionAscendente();
                    break;
                }
                case 5: {
                    if(catalogo.cantidadPeliculas() == 0){
                        System.out.println("Primero debería agregar alguna pelicula");
                        break;
                    }
                    catalogo.ordenarPeliculasPorDuracionDescendente();
                    break;
                }
                case 6: {
                    if(catalogo.cantidadPeliculas() == 0){
                        System.out.println("Primero debería agregar alguna pelicula");
                        break;
                    }
                    catalogo.ordenarPeliculaPorTitulo();
                    break;
                }
                case 7: {
                    if(catalogo.cantidadPeliculas() == 0){
                        System.out.println("Primero debería agregar alguna pelicula");
                        break;
                    }
                    catalogo.ordenarPeliculaPorDirector();
                    break;
                }
                case 0: {
                    break;
                }
            }
        }while(opcion != 0);
    }
}
