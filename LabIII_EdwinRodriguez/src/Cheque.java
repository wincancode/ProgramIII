
public class Cheque extends Pago {
    private int numeroDeCheque;
    private String entidadBancaria;

    // #region Metodos
    @Override
    public void ingresarDatos() {
        super.ingresarDatos();
        Reader reader = new Reader();

        System.out.println("Ingrese el numero de cheque");
        numeroDeCheque = Integer.parseInt(reader.getScanner());

        System.out.println("Ingrese la entidad bancaria ");
        entidadBancaria = reader.getScanner();

    }

    public void imprimir() {
        System.out.println("Pago por cheque: ");
        System.out.println("Entidad bancaria: " + entidadBancaria);
        System.out.println("Numero de cheque: " + numeroDeCheque);
        super.imprimir();
    }
    // #endregion

    // #region constructors
    public Cheque(float cantidadAPagar, int numeroDeCheque, String entidadBancaria) {
        this.cantidadAPagar = cantidadAPagar;

        this.numeroDeCheque = numeroDeCheque;
        this.entidadBancaria = entidadBancaria;
    }

    public Cheque() {
        this.cantidadAPagar = 0;

        this.numeroDeCheque = 0;
        this.entidadBancaria = "";
    }
    // #endregion

    // #region getters
    public int getNumeroDeCheque() {
        return numeroDeCheque;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }
    // #endregion

    // #region setters
    public void setNumeroDeCheque(int numeroDeCheque) {
        this.numeroDeCheque = numeroDeCheque;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }
    // #endregion
}
