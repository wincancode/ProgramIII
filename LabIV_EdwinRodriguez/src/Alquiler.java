import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private String posicionAmarre;
    private Barco barco;
    private double costo;
    private float alquilerFijo;
    private Cliente cliente;

    // #region metodos

    public double calcularAlquiler() {
        costo = getDiasOcupacion() * barco.calcularModulo() * alquilerFijo;
        return costo;
    }

    public int getDiasOcupacion() {
        return ((int) ChronoUnit.DAYS.between(fechaInicial, fechaFinal));
    }
    // #endregion

    // #region Constructors
    public Alquiler() {

    }

    public Alquiler(LocalDate fechaInicial, LocalDate fechaFinal, String posicionAmarre, Barco barco, float costo,
            Cliente cliente) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.costo = costo;
        this.cliente = cliente;
        this.alquilerFijo = 1200f;
    }
    // #endregion

    // #region Getters
    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public double getCosto() {
        return calcularAlquiler();
    }
    // #endregion

    // #region Setters
    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    // #endregion

    public float getAlquilerFijo() {
        return alquilerFijo;
    }

    public void setAlquilerFijo(float alquilerFijo) {
        this.alquilerFijo = alquilerFijo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
