public class ObjetoGuardable<E> {
    private int clave;
    private E objeto;

    public ObjetoGuardable() {
        clave = 0;
        objeto = null;
    }

    public ObjetoGuardable(int clave, E objeto) {
        this.clave = clave;
        this.objeto = objeto;
    }

    public void imprimir() {
        
        System.out.print("\nClave: " + clave);
        System.out.println("| Objeto: " + objeto.toString());
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public E getObjeto() {
        return objeto;
    }

    public void setObjeto(E objeto) {
        this.objeto = objeto;
    }

}
