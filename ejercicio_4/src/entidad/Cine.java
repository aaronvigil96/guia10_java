package entidad;

import java.util.ArrayList;
import java.util.Collections;

public class Cine {
    //Atributo
    private ArrayList<Pelicula> catalogo;
    
    //Constructor
    public Cine(){
        this.catalogo = new ArrayList<>();
    }

    //Métodos
    public void agregarPelicula(Pelicula pelicula){
        this.catalogo.add(pelicula);
    }
    
    public int cantidadPeliculas(){
        return this.catalogo.size();
    }
    
    public void mostrarPeliculas(){
        for (Pelicula pelicula : this.catalogo) {
            System.out.println(pelicula);
        }
    }
    
    public void mostrarPeliculasMayorA(int duracion){
        for (Pelicula pelicula : this.catalogo) {
            if(pelicula.getDuracion() > duracion){
                System.out.println(pelicula);
            }
        }
    }
    
    public void ordenarPeliculasPorDuracionAscendente(){
        Collections.sort(this.catalogo, new OrdenarPeliculaDuracionAscendente());
        for (Pelicula pelicula : this.catalogo) {
            System.out.println(pelicula);
        }
    }
    
    public void ordenarPeliculasPorDuracionDescendente(){
        Collections.sort(this.catalogo, new OrdenarPeliculaDuracionDescendente());
        for (Pelicula pelicula : this.catalogo) {
            System.out.println(pelicula);
        }
    }
    
    public void ordenarPeliculaPorTitulo(){
        Collections.sort(this.catalogo, new OrdenarPeliculaPorTitulo());
        for (Pelicula pelicula : this.catalogo) {
            System.out.println(pelicula);
        }
    }
    
    public void ordenarPeliculaPorDirector(){
        Collections.sort(this.catalogo, new OrdenarPeliculaPorDirector());
        for (Pelicula pelicula : this.catalogo) {
            System.out.println(pelicula);
        }
    }
    
}
