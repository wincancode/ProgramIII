public class Articulo {
    private String codigo;
    private String descripcion;
    private float precio;
    private float impuesto;
    private int cantidad;

    public void imprimir() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("precio: " + precio);
        System.out.println("impuesto: " + impuesto);
        System.out.println("cantidad: " + cantidad);
    }

    // #region Constructors

    public Articulo(String codigo, String descripcion, float precio, float impuesto, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.impuesto = impuesto;
        this.cantidad = cantidad;
    }

    public Articulo() {
        this.codigo = "";
        this.descripcion = "";
        this.precio = 0;
        this.impuesto = 0;
        this.cantidad = 0;
    }

    // hecho para copiar articulos.
    public Articulo(Articulo articulo, int cantidad) {
        this.codigo = articulo.codigo;
        this.descripcion = articulo.descripcion;
        this.precio = articulo.precio;
        this.impuesto = articulo.impuesto;
        this.cantidad = cantidad;
    }
    // #endregion

    // #region Getters
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public int getCantidad() {
        return cantidad;
    }
    // #endregion

    // #region setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    // #endregion
}
