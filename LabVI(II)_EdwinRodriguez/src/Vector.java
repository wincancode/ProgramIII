/**
 * Clase para almacenar un vector de números enteros y hacer operaciones con él.
 */
public class Vector {
    // componentes del vector
    private int[] componentes;

    /**
     * Constructor que crea un vector de la dimensión indicada, inicialmente con
     * todas sus
     * componentes a cero.
     *
     * @param dimension
     *                  El número de componentes del vector
     */
    public Vector(int dimension) {
        componentes = new int[dimension];
    }

    /**
     * Este método cambia la componente i-ésima del vector por el valor pasado
     * como argumento.
     *
     * @param pos
     *              El índice de la posición cuyo valor se va a cambiar.
     * @param valor
     *              El nuevo valor que le damos a la componente i-ésima del
     *              vector.
     */
    public void cambiaComponente(int pos, int valor) {
        try {
            componentes[pos] = valor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void acumular(Vector b) throws SizesDontMatchException {
        if (this.componentes.length != b.componentes.length) {
            throw new SizesDontMatchException("Los vectores no tienen la misma dimension");
        } else {

            for (int i = 0; i < componentes.length; i++)
                try {
                    this.componentes[i] += b.componentes[i];
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }

    }

    public Vector sumar(Vector b) throws SizesDontMatchException {

        Vector vector = new Vector(this.componentes.length);

        vector.componentes = this.componentes.clone();

        vector.acumular(b);

        return vector;
    }

    public void imprimir() {
        for (int i : componentes) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
