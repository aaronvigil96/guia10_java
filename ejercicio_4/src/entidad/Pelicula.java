package entidad;
public class Pelicula {
    //Atributos
    private String titulo;
    private String director;
    private int duracion;

    //Constructor
    public Pelicula(){
        
    }
    public Pelicula(String titulo, String director, int duracion){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    //Métodos
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
}
