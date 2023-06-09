
public class Main {

    public static void main(String[] args) throws Exception {

        Pedido pedido = new Pedido();
        Articulo[] articulos = pedido.generarArticulos();
   
        boolean Loop = true;

        while (Loop) {
            System.out.println("Ingrese que quiere realizar");
            System.out.println(
                    "1. Registrar un cliente \n2. Realizar un pedido\n3. Ver clientes registrados\n4. Ver pedidos registrados");

        }

        System.out.println("\nSe van a ingresar los datos del cliente");
        pedido.registrarCliente();

        System.out.println("\nSe van a ingresar los articulos del pedido");
        pedido.ingresarArticulos(articulos);

        System.out.println("\nSe van a ingresar los datos del pago.");
        pedido.administrarPago();

        System.out.println("\nSe va a imprimir los datos de la factura");
        pedido.imprimirFactura();

    }
}
