public class Supermercado {
    public static void main(String[] args) throws Exception {

        Caja caja[] = new Caja[4];

        caja[0] = new Caja(null, 1);
        caja[1] = new Caja(null, 2);
        caja[2] = new Caja(null, 3);
        caja[3] = new Caja(null, 4);

        caja[0].generarTicket();
        caja[0].generarTicket();
        caja[0].generarTicket();

        caja[1].generarTicket();
        caja[1].generarTicket();
        caja[1].generarTicket();

        caja[2].generarTicket();
        caja[2].generarTicket();
        caja[2].generarTicket();

        caja[3].generarTicket();
        caja[3].generarTicket();
        caja[3].generarTicket();

        for (Caja caja_ : caja) {
            caja_.imprimir();
        }
    }
}
/*
 * 1. En un supermercado hay varias cajas donde los clientes pueden pagar. Estas
 * cajas imprimen unos tickets que incluyen dos números:
 * a. El primero indica la caja donde paga el cliente.
 * b. El segundo cuenta cuántos clientes han pasado hasta los momentos por
 * cualquiera de las cajas del supermercado.
 * Ejemplo: Un recibo etiquetado como 4-13 indica que la caja 4 ha cobrado al
 * décimo tercer cliente. Si el siguiente cliente paga en la caja 2 su recibo
 * será
 * etiquetado como 2-14. Si la clase caja representa c/u de las cajas del
 * supermercado, se pide: completar sus atributos, su constructor y el método
 * que
 * devuelve las etiquetas de los recibos.
 * 
 */