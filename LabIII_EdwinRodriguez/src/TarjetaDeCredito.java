
public class TarjetaDeCredito extends Pago {

    private String proveedor;
    private String fechaDeCaducidad;
    private int numero;

    // #region Metodos
    @Override
    public void ingresarDatos() {
        super.ingresarDatos();
        Reader reader = new Reader();

        boolean eleccionLista = true;
        while (eleccionLista) {
            System.out.println("Ingrese el proveedor de la tarjeta; 1: VISA, 2: Mastercard");
            int eleccion = Integer.parseInt(reader.getScanner());

            if (eleccion == 1) {
                proveedor = "VISA";
                eleccionLista = false;
            } else if (eleccion == 2) {
                proveedor = "Mastercard";
                eleccionLista = false;
            } else
                System.out.println("Eleccion no valida");
        }

        System.out.println("Ingrese la fecha de caducidad de la tarjeta en el formato dd/MM/aaaa");
        fechaDeCaducidad = reader.getScanner();

        System.out.println("Ingrese el numero de la tarjtea");
        numero = Integer.parseInt(reader.getScanner());

    }

    public void imprimir() {
        System.out.println("Pago por Tarjeta de crédito: ");
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Fecha de Caducidad: " + fechaDeCaducidad);
        System.out.println("numero de tarjeta: " + numero);
        super.imprimir();
    }
    // #endregion

    // #region Constructors
    public TarjetaDeCredito(float cantidadAPagar, String proveedor, String fechaDeCaducidad, int numero) {
        this.cantidadAPagar = cantidadAPagar;
        this.proveedor = proveedor;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numero = numero;
    }

    public TarjetaDeCredito() {
        this.proveedor = "";
        this.fechaDeCaducidad = "";
        this.numero = 0;
    }
    // #endregion

    // #region getters
    public String getProveedor() {
        return proveedor;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public int getNumero() {
        return numero;
    }
    // #endregion

    // #region setters
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    // #endregion

}
