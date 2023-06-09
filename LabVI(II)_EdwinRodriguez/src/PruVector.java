public class PruVector {
    /**
     * Método principal de prueba de la clase Vector
     */
    public static void main(String[] args) {
        // crea vector (1, 2, 3)
        Vector v3a = new Vector(3);
        v3a.cambiaComponente(0, 1);
        v3a.cambiaComponente(10000, 2);
        v3a.cambiaComponente(2, 3);
        // crea vector (10, 20, 30)
        Vector v3b = new Vector(3);
        v3b.cambiaComponente(0, 10);
        v3b.cambiaComponente(1, 20);
        v3b.cambiaComponente(2, 30);
        // crea vector (0, 0, 0, 0)
        Vector v4a = new Vector(4);

        try {
            Vector v5 = v3a.sumar(v4a);
            v5.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
