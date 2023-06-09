import java.time.LocalDate;

public class Velero extends Barco {
    private int numeroMastiles;

    // #region constructors
    public Velero(String matricula, float eslora, LocalDate anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    

    public Velero(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Velero() {
    }
    // #endregion

    @Override
    public double calcularModulo() {
        return numeroMastiles + super.calcularModulo();

    }

    

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de mastiles: " + numeroMastiles);
    }



    // #region getters
    public int getNumeroMastiles() {
        return numeroMastiles;
    }
    // #endregion

    // #region setters
    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    // #endregion
}
