public class Pila<T> {

    static int MaxTamaPila = 100;
    private T arreglo[];
    private int cima = -1;

    public Pila(int tamanio) {
        arreglo = (T[]) new Object[tamanio];
        cima = -1;
    }

    public boolean pilaVacia() {
        return (cima == -1);
    }

    public boolean pilaLlena() {
        return cima == MaxTamaPila - 1;
    }

    public T Cima() {
        if (pilaVacia()) {
            System.out.println("Se intenta sacar un elemento de una pila vacia");
            return null;
        }
        return arreglo[cima];
    }

    public void limpiarFila() {
        cima = -1;
    }

    public T desapilar() {
        T aux = Cima();
        if (aux != null)
            cima--;
        return aux;
    }

    public int apilar(T Elemento) throws FullStack {
        if (pilaLlena()) {
            throw new FullStack("Se intenta apilar en una pila llena");
        }
        arreglo[++cima] = Elemento;
        return 1;
    }

    public void imprimir() throws FullStack {
        System.out.print("[");
        for (int i = 0; i <= cima; i++) {
            if (i != 0)
                System.out.print(",");
            System.out.print(arreglo[i].toString());
        }
        System.out.println("]");
    }

    public Pila<T> mezcla(Pila<T> q) {
        Pila<T> aux = new Pila<T>(this.arreglo.length + q.arreglo.length);

        T auxElemento;

        while (!this.pilaVacia() && !q.pilaVacia()) {
            if (!this.pilaVacia()) {
                auxElemento = this.desapilar();

                try {
                    aux.apilar(auxElemento);
                } catch (Exception e) {
                    e.getMessage();
                }
            }

            if (!q.pilaVacia()) {
                auxElemento = q.desapilar();
                try {
                    aux.apilar(auxElemento);
                } catch (Exception e) {
                    e.getMessage();
                }
            }

        }

        return aux;

    }

    public static int getMaxTamaPila() {
        return MaxTamaPila;
    }

    public T[] getArreglo() {
        return arreglo;
    }

    public int getCima() {
        return cima;
    }

    public static void setMaxTamaPila(int maxTamaPila) {
        MaxTamaPila = maxTamaPila;
    }

    public void setArreglo(T[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

}
