public class Cliente {
    private String nombre;
    private String cedula;
    private char genero;
    private String fechaNacimiento;

    // #region Metodos
    public void imprimir() {
        System.out.println("Atributos del cliente " + nombre);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula de identidad: " + cedula);
        System.out.println("Genero: " + genero);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }
    // #endregion

    // #region Getters

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public char getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    // #endregion

    // #region Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    // #endregion

    // #region Constructors
    public Cliente(String nombre, String cedula, char genero, String fechaNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente() {
        this.nombre = "";
        this.cedula = "";
        this.genero = ' ';
        this.fechaNacimiento = "";
    }
    // #endregion
}
