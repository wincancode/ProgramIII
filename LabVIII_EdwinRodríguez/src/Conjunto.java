
public class Conjunto {

    int longitud;
    Object[] conj;
    int indice;

    Conjunto(int longitud) {
        this.longitud = longitud;
        conj = new Object[longitud];
        for (int i = 0; i < longitud; i++)
            conj[i] = null;
    }

    Conjunto(int longitud, Object array[]) {
        this.longitud = longitud;
        conj = new Object[longitud];

        int i;
        for (i = 0; i < array.length && i < longitud; i++) {
            this.añadirElemento(array[i]);
        }

        for (; i < longitud; i++) {
            conj[i] = null;
        }

    }

    public void añadirElemento(Object elemento) {

        for (int i = 0; i < longitud; i++) {

            if (conj[i] != null && elemento != null && elemento.equals(conj[i])) {
                // Los dos elementos son iguales
                return;
            }

        }

        for (int i = 0; i < longitud; i++) {
            if (conj[i] == null) {
                conj[i] = elemento;
                return;
            }
        }
    }

    public void imprimir() {
        System.out.print("{");

        for (int i = 0; i < longitud; i++) {
            if (conj[i] != null) {
                if (i != 0)
                    System.out.print(",");
                System.out.print(conj[i].toString());
            }

        }

        System.out.println("}");
    }

    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        int longitudC3 = 0;
        Object aux[] = new Object[c1.longitud > c2.longitud ? c1.longitud : c2.longitud];

        for (Object object : c1.conj) {
            for (Object object2 : c2.conj) {
                if (object != null && object2 != null && object.equals(object2)) {
                    aux[longitudC3] = object;
                    longitudC3++;
                    break;
                }
            }
        }

        Conjunto c3 = new Conjunto(longitudC3, aux);

        return c3;
    }

    public static Conjunto Union(Conjunto c1, Conjunto c2) {
        Conjunto aux = new Conjunto(c1.longitud + c2.longitud);
        int c3Longitud = 0;

        for (Object object : c1.conj) {
            if (object != null)
                aux.añadirElemento(object);
            c3Longitud++;
        }
        for (Object object : c2.conj) {
            if (object != null)
                aux.añadirElemento(object);
            c3Longitud++;
        }

        return new Conjunto(c3Longitud, aux.conj);
    }

    public static Conjunto productoCartesiano(Conjunto c1, Conjunto c2) {
        Conjunto aux = new Conjunto(c1.longitud * c2.longitud);
        int c3Longitud = 0;
        for (Object object : c1.conj) {
            for (Object object2 : c2.conj) {
                if (object != null && object2 != null) {
                    aux.añadirElemento(new ParCartesiano(object, object2));
                    c3Longitud++;
                }
            }
        }
        return new Conjunto(c3Longitud, aux.conj);

    }

}
