public class Cliente {
    private String nombre;
    private String cedula;

    // #region constructors
    public Cliente() {
    }

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    // #endregion

    // #region getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    // #endregion

    // #region setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    // #endregion

}
