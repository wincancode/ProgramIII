import java.time.LocalDate;

public class Barco {

    protected String matricula;
    protected float eslora;
    protected LocalDate anioFabricacion;

    public void imprimir() {
        System.out.println("Datos del " + this.getClass().getSimpleName() + " de matricula " + matricula);
        System.out.println("Eslora: " + eslora);
        System.out.println("Anio de fabricacion: " + anioFabricacion);
    }

    public double calcularModulo() {
        return 10 * eslora;
    }

    // #region constructors
    public Barco() {
    }

    public Barco(String matricula, float eslora, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    // #endregion

    // #region getters
    public String getMatricula() {
        return matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }
    // #endregion

    // #region Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    // #endregion
}
