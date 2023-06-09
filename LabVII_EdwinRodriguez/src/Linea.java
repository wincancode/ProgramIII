
public class Linea implements RelacionOrden {
    private Punto p1, p2;

    @Override
    public void comparar(Object elemento) {
        double longitud1 = calcularLongitud();
        double longitud2 = ((Linea) elemento).calcularLongitud();

        System.out.println("\nLinea 1");
        ((Linea) elemento).p1.imprimir();
        ((Linea) elemento).p2.imprimir();
        System.out.println("\nLinea 2");
        p1.imprimir();
        p2.imprimir();
        System.out.println("");

        if (longitud1 > longitud2) {
            System.out.print("La linea 1 es mayor que la linea 2");
        }
        if (longitud1 < longitud2) {
            System.out.print("La linea 1 es menor que la linea 2");
        }
        if (longitud1 == longitud2)
            System.out.print("La linea 1 es igual que la linea 2");
    }

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public double calcularLongitud() {
        double x = (p1.x - p2.x);
        double y = (p1.y - p2.y);
        return (Math.sqrt(x * x + y * y));
    }
}
