import java.util.Arrays;

@SuppressWarnings("unused")
public class Mago extends Personaje {
    private static String emptySlot = "No Hechizos";
    private String[] hechizos;

    // #region Constructors

    protected void SetCappedStatistics(int f, int i) {
        if (i < 17) {
            setInteligencia(17);
            System.out.println(
                    "Los personajes de la clase mago no pueden tener una inteligencia menor a 17. Se asignará automáticamente una inteligencia de 17.");
        }

        if (f > 15)
            setFuerza(15);
        System.out.println(
                "Los personajes de la clase mago no pueden tener una fuerza mayor a 15. Se asignará automáticamente una fuerza de 15.");

    }

    public Mago() {

        super();
        hechizos = new String[4];
        for (int i = 0; i < 4; i++) {
            hechizos[i] = emptySlot;
        }

    }

    public Mago(String nombre, String raza, int f, int i, int vmax) {
        super(nombre, raza, f, i, vmax);

        hechizos = new String[4];
        for (int j = 0; j < 4; j++) {
            hechizos[j] = emptySlot;
        }
    }
    // #endregion

    // #region Metodos de Mago

    // optimize
    public void imprimir() {
        super.imprimir();

        System.out.println("Hechizos aprendidos: "
                + Arrays.toString(hechizos).replace(", " + emptySlot, "").replaceFirst(emptySlot + ", ", ""));
    }

    // Colocar for normal a estas dos funciones

    public void aprendeHechizo(String hechizo) {
        for (int j = 0; j < 4; j++) {
            if (hechizos[j].equals(emptySlot)) {
                hechizos[j] = hechizo;
                return;
            }
        }
    }

    public void lanzaHechizo(Personaje objetivo) {
        for (int j = 0; j < 4; j++) {
            if (!hechizos[j].equals(emptySlot)) {
                objetivo.vidaActual -= 10;
                hechizos[j] = emptySlot;
                return;
            }
        }

        System.out.println("El mago " + nombre + " no tiene hechizos disponibles!!!");
    }

    // #endregion
}
