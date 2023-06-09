import java.util.Comparator;

public class OrdenarCantanteFamosoPorNombre implements Comparator<CantanteFamoso> {

    @Override
    public int compare(CantanteFamoso cantanteFamoso1, CantanteFamoso cantanteFamoso2) {
        return cantanteFamoso1.getNombre().compareTo(cantanteFamoso2.getNombre());
    }

}
