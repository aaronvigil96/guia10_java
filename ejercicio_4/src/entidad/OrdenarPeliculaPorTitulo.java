package entidad;

import java.util.Comparator;

public class OrdenarPeliculaPorTitulo implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula pUno, Pelicula pDos) {
        return pUno.getTitulo().compareTo(pDos.getTitulo());
    }
}
