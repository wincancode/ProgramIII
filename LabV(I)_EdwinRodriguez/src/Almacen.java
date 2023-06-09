public class Almacen<E> {

    private int capacidadMaxima;
    private ObjetoGuardable<E>[] objetos;

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ObjetoGuardable<E>[] getObjetos() {
        return objetos;
    }

    public void setObjetos(ObjetoGuardable<E>[] objetos) {
        this.objetos = objetos;
    }

    public Almacen() {
    }

    public Almacen(int capacidadMaxima, ObjetoGuardable<E>[] objetos) {
        this.capacidadMaxima = capacidadMaxima;
        this.objetos = objetos;
    }

    public Almacen(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        objetos = new ObjetoGuardable[capacidadMaxima];
    }

    public boolean estaLLeno() {
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void ingresarObjeto(ObjetoGuardable<E> objeto) {

        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] != null && objetos[i].getClave() == objeto.getClave()) {
                objetos[i] = objeto;
                return;
            }
        }
        
        if (estaLLeno()) {
            System.out.println("El almacen esta lleno");
            return;
        }

        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] == null) {
                objetos[i] = objeto;
                return;
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] != null) {
                objetos[i].imprimir();
            } else {
                System.out.println("Espacio vacio");
            }
        }
    }

    public E sacarObjeto(int clave) {
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i].getClave() == clave) {
                E objeto = objetos[i].getObjeto();
                objetos[i] = null;
                return objeto;
            }
        }
        return null;
    }

}
