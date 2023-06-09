import java.util.Comparator;

public class OrdenarCantanteFamosoPorDisco implements Comparator<CantanteFamoso> {

    @Override
    public int compare(CantanteFamoso cantanteFamoso1, CantanteFamoso cantanteFamoso2) {
        return cantanteFamoso1.getNombreDisco().compareTo(cantanteFamoso2.getNombreDisco());
    }

}
