import java.time.LocalDate;

public class DeportivoAMotor extends Barco {
    protected float potenciaCV;

    @Override
    public double calcularModulo() {
        return potenciaCV + super.calcularModulo();
    }
    

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Potencia en CV: " + potenciaCV);
    }


    // #region constructors
    public DeportivoAMotor(String matricula, float eslora, LocalDate anioFabricacion, float potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public DeportivoAMotor(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public DeportivoAMotor() {

    }
    // #endregion

    // #region getters
    public float getPotenciaCV() {
        return potenciaCV;
    }
    // #endregion

    // #region setters
    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    // #endregion
}
