import java.time.LocalDate;

public class YateDeLujo extends DeportivoAMotor {
    private int numeroCamarotes;

    // #region constructors
    public YateDeLujo(String matricula, float eslora, LocalDate anioFabricacion, float potenciaCV,
            int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion, potenciaCV);
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateDeLujo(float potenciaCV, int numeroCamarotes) {
        super(potenciaCV);
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateDeLujo(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateDeLujo() {

    }
    // #endregion

    @Override
    public double calcularModulo() {
        return numeroCamarotes + super.calcularModulo();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de camarotes: " + numeroCamarotes);
    }

    // #region getters
    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }
    // #endregion

    // #region setters
    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    // #endregion

}
