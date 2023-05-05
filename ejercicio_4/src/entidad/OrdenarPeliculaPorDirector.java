package entidad;

import java.util.Comparator;

public class OrdenarPeliculaPorDirector implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula pUno, Pelicula pDos) {
        return pUno.getDirector().compareTo(pDos.getDirector());
    }
    
}
