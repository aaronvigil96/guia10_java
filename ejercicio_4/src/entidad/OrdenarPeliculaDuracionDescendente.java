package entidad;

import java.util.Comparator;

public class OrdenarPeliculaDuracionDescendente implements Comparator<Pelicula>{
    @Override
    public int compare(Pelicula pUno, Pelicula pDos) {
        return pDos.getDuracion() - pUno.getDuracion();
    }
    
}
