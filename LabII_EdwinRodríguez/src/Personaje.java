
public class Personaje {
    // #region Constantes Maximos/posibles de los atributos de Personaje
    protected static int maximoFuerza = 20;
    protected static int maximoInteligencia = 20;
    protected static int maximoVidaMaxima = 100;
    protected static String[] RazasPosibles = { "humano", "elfo", "enano", "orco" };
    // #endregion

    // #region Atributos del Personaje
    protected String nombre, raza;
    protected int fuerza, inteligencia, vidaMax, vidaActual;
    // #endregion

    public void imprimir() {

        System.out.println(
                "\nNombre: " + nombre +
                        "\nRaza: " + raza +
                        "\nFuerza: " + fuerza +
                        "\nInteligencia: " + inteligencia +
                        "\nVida Maxima: " + vidaMax +
                        "\nVida Actual: " + vidaActual);

    }

    // #region constructors

    protected void SetCappedStatistics(int f, int i) {

    }

    public Personaje() {
        nombre = raza = "";
        fuerza = inteligencia = vidaMax = vidaActual = 0;
    }

    public Personaje(String nombre, String raza, int f, int i, int vmax) {

        this.SetCappedStatistics(f, i);

        setNombre(nombre);
        setRaza(raza);
        setVidaMax(vmax);
        setVidaActual(vmax);

    }
    // #endregion

    // #region setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        boolean RaceIsValid = false;
        raza = "No definido";
        for (String racesString : RazasPosibles) {
            if (racesString.equals(raza)) {
                RaceIsValid = true;
                // View how to exit a foreach
            }
        }
        if (RaceIsValid)
            this.raza = raza;
        else
            System.out.println("Exepción: La raza " + raza + " No es una raza válida. el atributo de raza de "
                    + nombre + " se mantendrá igual.");
    }

    public void setFuerza(int fuerza) {
        if (fuerza >= 0 && fuerza <= maximoFuerza)
            this.fuerza = fuerza;
        else
            System.out.println("La fuerza del personaje debe de estar entre 0 y " + maximoFuerza
                    + ". El atributo de fuerza de " + nombre + " se mantendrá igual.");

    }

    public void setInteligencia(int inteligencia) {
        if (inteligencia >= 0 && inteligencia <= maximoInteligencia)
            this.inteligencia = inteligencia;
        else
            System.out.println("La inteligencia del personaje debe de estar entre 0 y " + maximoInteligencia
                    + ". El atributo de inteligencia de " + nombre + " se mantendrá igual.");
    }

    public void setVidaMax(int vidaMax) {
        if (vidaMax >= 0 && vidaMax <= maximoVidaMaxima)
            this.vidaMax = vidaMax;
        else
            System.out.println("La vida maxima del personaje debe de estar entre 0 y " + maximoVidaMaxima
                    + ". El atributo de vida maxima de " + nombre + " se mantendrá igual.");
    }

    // Optimize
    public void setVidaActual(int vidaActual) {
        if (vidaMax > 0)
            if (vidaActual >= 0 && vidaActual <= vidaMax)
                this.vidaActual = vidaActual;
            else
                System.out.println("La vida actual del personaje debe de estar entre 0 y " + vidaMax
                        + ". El atributo de vida actual de " + nombre + " se mantendrá igual.");
        else
            System.out.println(
                    "La vida maxima actualmente es 0. No se puede asignar vida actual en este momento.");

    }

    // #endregion

    // #region getters
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public int getVidaMax() {
        return vidaMax;
    }
    // #endregion
}