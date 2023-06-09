
public class Efectivo extends Pago {
    private int cantidadDeBilletes;

    // #region Metodos
    @Override
    public void ingresarDatos() {
        super.ingresarDatos();

        Reader reader = new Reader();
        System.out.println("Ingrese la cantidad de billetes con la que va a realizar el pago ");
        cantidadDeBilletes = Integer.parseInt(reader.getScanner());

    }

    public void imprimir() {
        System.out.println("Pago por Billetes");
        System.out.println("Pago hecho en " + cantidadDeBilletes + " billetes");
        super.imprimir();
    }
    // #endregion

    // #region constructors
    public Efectivo() {
        super.setCantidadAPagar(0);
        this.cantidadDeBilletes = 0;

    }

    public Efectivo(float cantidadAPagar, int cantidadDeBilletes) {
        this.cantidadAPagar = cantidadAPagar;
        this.cantidadDeBilletes = cantidadDeBilletes;
    }
    // #endregion

    // #region getters
    public int getCantidadDeBilletes() {
        return cantidadDeBilletes;
    }
    // #endregion

    // #region setters
    public void setCantidadDeBilletes(int cantidadDeBilletes) {
        this.cantidadDeBilletes = cantidadDeBilletes;
    }
    // #endregion

}
