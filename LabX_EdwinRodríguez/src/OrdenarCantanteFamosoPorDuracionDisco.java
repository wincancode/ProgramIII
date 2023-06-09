import java.util.Comparator;

public class OrdenarCantanteFamosoPorDuracionDisco implements Comparator<CantanteFamoso> {
    
    @Override
    public int compare(CantanteFamoso cantanteFamoso1, CantanteFamoso cantanteFamoso2) {
        return cantanteFamoso1.getDuracionDisco() - cantanteFamoso2.getDuracionDisco();
    }
}
