
abstract public class Pago {
    protected float cantidadAPagar;

    // #region Metodos
    public void ingresarDatos() {
        Reader reader = new Reader();
        System.out.println("Ingrese la cantidad a pagar con este pago");
        cantidadAPagar = Float.parseFloat(reader.getScanner());
    }

    public void imprimir() {
        System.out.println("cantidad: " + cantidadAPagar + " dolares.");
    }
    // #endregion

    // #region Constructors
    public Pago(float cantidadAPagar) {
        this.cantidadAPagar = cantidadAPagar;
    }

    public Pago() {
        this.cantidadAPagar = 0;
    }
    // #endregion

    // #region Getters
    public float getCantidadAPagar() {
        return cantidadAPagar;
    }
    // #endregion

    // #region Setters
    public void setCantidadAPagar(float cantidadAPagar) {
        this.cantidadAPagar = cantidadAPagar;
    }
    // #endregions
}
