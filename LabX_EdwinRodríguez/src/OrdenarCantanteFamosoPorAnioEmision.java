import java.util.Comparator;

public class OrdenarCantanteFamosoPorAnioEmision implements Comparator<CantanteFamoso> {

    @Override
    public int compare(CantanteFamoso cantanteFamoso1, CantanteFamoso cantanteFamoso2) {
        return cantanteFamoso1.getAñoEmision() - cantanteFamoso2.getAñoEmision();
    }
}
