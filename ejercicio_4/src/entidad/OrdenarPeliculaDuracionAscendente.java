package entidad;

import java.util.Comparator;

public class OrdenarPeliculaDuracionAscendente implements Comparator<Pelicula>{
    @Override
    public int compare(Pelicula pUno, Pelicula pDos) {
        return pUno.getDuracion() - pDos.getDuracion();
    }
    
}
