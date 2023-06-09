public class App {
    public static void main(String[] args) throws Exception {

        Numero numeros[] = new Numero[3];
        numeros[0] = new Numero(0);
        numeros[1] = new Numero(-1);
        numeros[2] = new Numero(1);

        numeros[0].comparar(numeros[0]);
        numeros[0].comparar(numeros[1]);
        numeros[0].comparar(numeros[2]);

        Linea lineas[] = new Linea[3];
        lineas[0] = new Linea(new Punto(1, 1), new Punto(2, 2));
        lineas[1] = new Linea(new Punto(1, 1), new Punto(.5, .5));
        lineas[2] = new Linea(new Punto(1, 1), new Punto(5, 5));

        lineas[0].comparar(lineas[0]);
        lineas[0].comparar(lineas[1]);
        lineas[0].comparar(lineas[2]);

    }
}
