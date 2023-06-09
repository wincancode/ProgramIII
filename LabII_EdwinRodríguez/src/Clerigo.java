
public class Clerigo extends Personaje {
    private String Dios;


    public void imprimir() {
        super.imprimir();
        System.out.println("Dios al que reza: " + Dios);
    }

    // #region Constructors
    protected void SetCappedStatistics(int f, int i) {
        if (i <= 12 && i >= 16) {
            setInteligencia(13);
            System.out.println(
                    "Los personajes de la clase clérigo no pueden tener una inteligencia menor o igual a 12 ni mayor o igual a 16. Se asignará automáticamente una inteligencia de 13.");
        }

        if (f < 18)
            setFuerza(18);
        System.out.println(
                "Los personajes de la clase clérigo no pueden tener una fuerza mayor a 18. Se asignará automáticamente una fuerza de 18.");

    }

    public Clerigo() {
        super();
        Dios = "";

    }

    public Clerigo(String nombre, String raza, int f, int i, int vmax, String Dios) {
        super(nombre, raza, f, i, vmax);

        this.Dios = Dios;

    }
    // #endregion

    public void Curar(Personaje objetivo) {
        objetivo.vidaActual += 10;
    }

}
