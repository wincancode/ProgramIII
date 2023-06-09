
public class Carta {
    private String color;
    private String pinta;
    private String numero;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPinta() {
        return pinta;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Carta() {
    }

    public Carta(String pinta, String numero) {
        // rojo corazon y diamante
        // negro trebol y pica
        if (pinta.toLowerCase() == "treboles" || pinta.toLowerCase() == "picas")
            color = "rojo";
        else
            color = "negro";
        this.pinta = pinta;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + " de " + pinta;
    }

}
