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
package entidad;

import java.util.Iterator;
import java.util.TreeSet;

public class Paises {
    //Atributos
    private TreeSet<String> paises;
    
    //Constructor
    public Paises(){
        this.paises = new TreeSet<>();
    }
    
    //Métodos
    public void agregarPais(String pais){
        if(!this.paises.add(pais.toLowerCase())){
           System.out.println("Lo siento, ese pais ya está creado");
        }else {
            System.out.println("Pais creado con éxito");
        }   
    }
    
    public void eliminarPais(String pais){
        boolean elimino = false;
        Iterator<String> iterator = this.paises.iterator();
        String paisIterator;
        while(iterator.hasNext()){
            paisIterator = iterator.next();
            if(paisIterator.equals(pais)){
                iterator.remove();
                elimino = true;
                break;
            }
        }
        if(elimino){
            System.out.println("Se eliminó correctamente");
        }else {
            System.out.println("No se encontró ese Pais");
        }
    }
    
    public void mostrarPaises(){
        for (String paise : this.paises) {
            System.out.println(paise.toUpperCase().charAt(0) + paise.substring(1, paise.length()));
        }
    }
    
    public int cantidadPaises(){
        return this.paises.size();
    }
    
}
