import java.util.Scanner;

public class ConjuntosPrograma {
    public static void main(String[] args) throws Exception {

        Conjunto conjuntos[] = new Conjunto[3];
        conjuntos[0] = new Conjunto(10);
        conjuntos[1] = new Conjunto(10);
        conjuntos[2] = new Conjunto(10);
        int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        int dato1;
        Object dato3;

        while (opcion != 0) {
            System.out.println("Cuenta con dos conjuntos a utilizar. Uno de enteros, otro de caracteres.");
            System.out.println("0: Salir del programa");
            System.out.println("1: Ingresar un elemento a un conjunto");
            System.out.println("2: imprimir todos los conjuntos");
            System.out.println("3: Unir dos conjuntos");
            System.out.println("4: Intersecar dos conjuntos");
            System.out.println("5: Obtener el producto cartesiano de dos conjuntos");
           
            opcion = Integer.parseInt(scanner.nextLine());
           
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el conjunto que quiere utilizar, del 1 al 2");
                    dato1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el elemento");
                    dato3 = (Object) scanner.nextLine();
                    conjuntos[dato1 - 1].añadirElemento(dato3);
                    break;

                case 2:
                    for (Conjunto conjunto : conjuntos) {
                        conjunto.imprimir();
                    }
                    break;

                case 3:
                    conjuntos[2] = Conjunto.Union(conjuntos[0], conjuntos[1]);
                    System.out.println("A: ");
                    conjuntos[0].imprimir();
                    System.out.println("B: ");
                    conjuntos[1].imprimir();
                    System.out.println("A U B: ");
                    conjuntos[2].imprimir();
                    break;

                case 4:
                    conjuntos[2] = Conjunto.interseccion(conjuntos[0], conjuntos[1]);
                    System.out.println("A: ");
                    conjuntos[0].imprimir();
                    System.out.println("B: ");
                    conjuntos[1].imprimir();
                    System.out.println("A Interseccion B: ");
                    conjuntos[2].imprimir();
                    break;
                case 5:
                    conjuntos[2] = Conjunto.productoCartesiano(conjuntos[0], conjuntos[1]);
                    System.out.println("A: ");
                    conjuntos[0].imprimir();
                    System.out.println("B: ");
                    conjuntos[1].imprimir();
                    System.out.println("A x B: ");
                    conjuntos[2].imprimir();
                default:
                    break;
            }
        }

        scanner.close();

    }

}
