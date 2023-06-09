public class Main {
    public static void main(String[] args) throws Exception {

        Pila<Object> a = new Pila<>(60);
        Pila<Object> b = new Pila<>(50);

        Libro libros[] = new Libro[4];
        Carta cartas[] = new Carta[5];

        libros[0] = new Libro("Alexandre Doumas", "El conde de montecristo");
        libros[1] = new Libro("Platon", "La republica");
        libros[2] = new Libro("Maquiavelo", "El Principe");
        libros[3] = new Libro("Dante Aliguieri", "La divina comedia");

        cartas[0] = new Carta("Treboles", "A");
        cartas[1] = new Carta("Corazones", "3");
        cartas[2] = new Carta("Picas", "4");
        cartas[3] = new Carta("Treboles", "5");
        cartas[4] = new Carta("Corazones", "9");

        for (Carta carta : cartas) {
            a.apilar(carta);
        }

        for (Libro libro : libros) {
            b.apilar(libro);
        }

        a.imprimir();
        b.imprimir();

        Pila<Object> c = a.mezcla(b);

        c.imprimir();
    }
}
