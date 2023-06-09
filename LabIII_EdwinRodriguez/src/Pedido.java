import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    // #region Variables
    private int costeTotal;
    private float vuelto;
    private LocalDate fecha;
    private ArrayList<Articulo> arrArticulos = new ArrayList<Articulo>();
    private Cliente cliente;
    private ArrayList<Pago> pagos = new ArrayList<Pago>();
    // #endregion

    // #region Metodos

    public void imprimirFactura() {
        fecha = LocalDate.now();
        System.out.println("\nFactura del pedido");
        System.out.println("-----------\nFecha: " + fecha + "\n-----------");
        System.out.println("Comprador: " + cliente.getClass());
        System.out.println("Cedula de identidad: " + cliente.getCedula() + "\n-----------");

        System.out.println("Pedido: ");
        for (Articulo articulo : arrArticulos) {
            System.out.print(articulo.getDescripcion() + " x " + articulo.getCantidad() + "  "
                    + (articulo.getPrecio() * articulo.getCantidad()
                            + (articulo.getPrecio() * articulo.getCantidad() * articulo.getImpuesto())
                                    / 100)
                    + " dolares \n");

        }

        System.out.println("-----------\nCoste total despues de impuestos: " + costeTotal);
        System.out.println("Metodos de pago utilizados: ");
        for (Pago pago : pagos) {
            System.out.println("----------X-------");
            pago.imprimir();
            System.out.println("----------X-------");
        }

        System.out.println("Vuelto a dar: " + vuelto);
    }

    public void administrarPago() {
        int cantidadDePagos = 0;
        float costeTemp = costeTotal;
        Reader reader = new Reader();

        System.out.println("\nEl cliente debe de pagar un total de " + costeTotal + " dólares");
        System.out.println("Ingrese la cantidad de pagos que desea realizar y la manera en la que los va a realizar");
        cantidadDePagos = Integer.parseInt(reader.getScanner());

        int contador = 0;
        while (contador < cantidadDePagos && costeTemp > 0)

        {
            int eleccion = 0;
            System.out.println("\nEl cliente sigue debiendo " + costeTemp + " dolares");
            System.out.println("Ingrese que tipo de pago desea para el pago numero " + (contador + 1));
            System.out.println("1: efectivo \n2: tarjeta \n3: cheque");
            eleccion = Integer.parseInt(reader.getScanner());

            switch (eleccion) {
                case 1:
                    Efectivo efectivo = new Efectivo();
                    efectivo.ingresarDatos();
                    pagos.add(efectivo);
                    break;

                case 2:
                    TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito();
                    tarjetaDeCredito.ingresarDatos();
                    pagos.add(tarjetaDeCredito);
                    break;

                case 3:
                    Cheque cheque = new Cheque();
                    cheque.ingresarDatos();
                    pagos.add(cheque);
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

            if (eleccion == 1 || eleccion == 2 || eleccion == 3) {
                costeTemp -= pagos.get(contador++).getCantidadAPagar();

                if (costeTemp <= 0) {

                    if (contador < cantidadDePagos)
                        System.out.println(
                                "Ya ha pagado la totalidad del coste, o se ha pasado y debe recibir un vuelto. No se seguirán registrando pagos.");
                    vuelto = costeTemp * -1f;
                    costeTemp = 0;
                }
            }

        }
        System.out.println("Ya se ingresaron los datos del pago");

    }

    public void ingresarArticulos(Articulo[] seleccion) {
        boolean eleccionTerminada = true;
        Reader reader = new Reader();

        while (eleccionTerminada) {
            int opcion = 0;
            System.out.println(
                    "\n\nIngrese una opción: \n1:Agregar un articulo \n2:Terminar de elegir");
            opcion = Integer.parseInt(reader.getScanner());

            switch (opcion) {
                case 1:
                    int productoElegido = 0;
                    int cantidad = 0;
                    System.out
                            .println("introduzca el numero de uno de los siguientes " + seleccion.length + "elementos");

                    int i = 1;

                    for (Articulo articulo : seleccion) {
                        System.out.println(i++ + ".- " + articulo.getDescripcion());
                    }

                    productoElegido = Integer.parseInt(reader.getScanner());

                    System.out.println("Ingrese cuanta cantidad del producto desea agregar");
                    cantidad = Integer.parseInt(reader.getScanner());

                    addArticle(new Articulo(seleccion[productoElegido - 1], cantidad));
                    break;

                case 2:
                    System.out.println("Su seleccion total fue la de: ");
                    for (Articulo articulo : arrArticulos) {
                        System.out.print(articulo.getDescripcion() + " x " + articulo.getCantidad() + "  "
                                + (articulo.getPrecio() * articulo.getCantidad()
                                        + (articulo.getPrecio() * articulo.getCantidad() * articulo.getImpuesto())
                                                / 100)
                                + " dolares \n");

                    }
                    System.out.println("\n");
                    eleccionTerminada = false;
                    break;

                default:
                    System.out.println("No es una opcion valida.");
                    break;
            }
        }

    }

    public Articulo[] generarArticulos() {
        Articulo[] articulos = new Articulo[10];
        articulos[0] = new Articulo("001", "Un balón de footbal", 1f, 2f, 1);
        articulos[1] = new Articulo("002", "Un balón de basketball", 1f, 2f, 1);
        articulos[2] = new Articulo("003", "Un balón de volleyball", 4f, 2f, 1);
        articulos[3] = new Articulo("004", "Una kilogramo de Whey Protein", 4f, 2f, 1);
        articulos[4] = new Articulo("005", "Un kilogramo de mantequilla de maní", 3f, 2f, 1);
        articulos[5] = new Articulo("006", "Un paquete de barras de cereal", 1.5f, 2f, 1);
        articulos[6] = new Articulo("007", "Un kit de pesas", 10.5f, 2f, 1);
        articulos[7] = new Articulo("008", "Un par de tobilleras", 7.5f, 2f, 1);
        articulos[8] = new Articulo("009", "Un par de guantes", 6f, 2f, 1);
        articulos[9] = new Articulo("010", "Una bate de baseball", 10.5f, 2f, 1);
        return articulos;
    }

    public void registrarCliente() {
        String nombre;
        String cedula;
        char genero;
        String fechaNacimiento;
        Reader reader = new Reader();

        System.out.println("\nIngrese el nombre del Cliente");
        nombre = reader.getScanner();
        System.out.println("Ingrese la cedula del cliente");
        cedula = reader.getScanner();
        System.out.println("ingrese el genero del cliente. M: masculino, F: femenino, O: otro");
        genero = reader.getScanner().charAt(0);
        System.out.println("Ingrese la fecha de nacimiento del cliente en el formato. dd/MM/aaaa");
        fechaNacimiento = reader.getScanner();

        cliente = new Cliente(nombre, cedula, genero, fechaNacimiento);
    }

    public void addArticle(Articulo articulo) {
        arrArticulos.add(articulo);
        float costeArticulo = articulo.getPrecio() * articulo.getCantidad();
        costeArticulo += (costeArticulo * articulo.getImpuesto()) / 100;
        costeTotal += costeArticulo;
    }

    // #endregion

    // #region Constructores

    public Pedido(int costeTotal, float vuelto, LocalDate fecha, ArrayList<Articulo> arrArticulos, Cliente cliente,
            ArrayList<Pago> pagos) {
        this.costeTotal = costeTotal;
        this.vuelto = vuelto;
        this.fecha = fecha;
        this.arrArticulos = arrArticulos;
        this.cliente = cliente;
        this.pagos = pagos;
    }

    public Pedido() {
        this.costeTotal = 0;
        this.vuelto = 0;
        this.cliente = new Cliente();
    }

    // #endregion

    // #region Getters
    public int getCosteTotal() {
        return costeTotal;
    }

    public float getVuelto() {
        return vuelto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public ArrayList<Articulo> getArrArticulos() {
        return arrArticulos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }
    // #endregion

    // #region Setters
    public void setCosteTotal(int costeTotal) {
        this.costeTotal = costeTotal;
    }

    public void setVuelto(float vuelto) {
        this.vuelto = vuelto;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setArrArticulos(ArrayList<Articulo> arrArticulos) {
        this.arrArticulos = arrArticulos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }
    // #endregion

}
