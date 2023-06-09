public class CantanteFamoso implements Comparable<CantanteFamoso> {

    // Atributos
    private String nombre;
    private String nombreDisco;
    private int añoEmision;
    private int duracionDisco;

    // Constructor
    public CantanteFamoso(String nombre, String nombreDisco, int añoEmision, int duracionDisco) {
        this.nombre = nombre;
        this.nombreDisco = nombreDisco;
        this.añoEmision = añoEmision;
        this.duracionDisco = duracionDisco;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    public int getAñoEmision() {
        return añoEmision;
    }

    public void setAñoEmision(int añoEmision) {
        this.añoEmision = añoEmision;
    }

    public int getDuracionDisco() {
        return duracionDisco;
    }

    public void setDuracionDisco(int duracionDisco) {
        this.duracionDisco = duracionDisco;
    }

    public void imprimir() {
        System.out.println("Cantante: " + nombre);
        System.out.println("Disco con mas ventas: " + nombreDisco);
    }

    // compareTo
    @Override
    public int compareTo(CantanteFamoso cantanteFamoso) {
        return this.nombre.compareTo(cantanteFamoso.getNombre());
    }

}
