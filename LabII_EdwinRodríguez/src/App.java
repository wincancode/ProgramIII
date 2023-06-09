import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Mago[] magos = new Mago[2];
        Clerigo clerigo;
        int i, f, vmax;
        String nombre, raza;
        Scanner entrada = new Scanner(System.in);
        // JFrame jframe = new JFrame();

        System.out.println(
                "A continuacion podrá ingresar los datos de dos mago y un clérigo para poder hacerlos interactuar.");
        for (int j = 0; j <= 1; j++) {

            System.out.println("Empiece a crear el mago numero " + (j + 1));

            System.out.println("Ingrese el nombre de su nuevo personaje");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la raza de su nuevo personaje. Puede ser elfo, orco, humano o enano");
            raza = entrada.nextLine();

            System.out.println("Ingrese la fuerza de su nuevo personaje");
            f = Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese la intelifencia de su nuevo personaje");
            i = Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese la vida maxima de su nuevo personaje");
            vmax = Integer.parseInt(entrada.nextLine());

            magos[j] = new Mago(nombre, raza, f, i, vmax);
        }

        String Dios;

        System.out.println("Empiece a crear el clerigo numero 1");

        System.out.println("Ingrese el nombre de su nuevo personaje");
        nombre = entrada.nextLine();

        System.out.println("Ingrese la raza de su nuevo personaje. Puede ser elfo, orco, humano o enano");
        raza = entrada.nextLine();

        System.out.println("Ingrese el dios de su nuevo personaje.");
        Dios = entrada.nextLine();

        System.out.println("Ingrese la fuerza de su nuevo personaje");
        f = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese la intelifencia de su nuevo personaje");
        i = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese la vida maxima de su nuevo personaje");
        vmax = Integer.parseInt(entrada.nextLine());

        clerigo = new Clerigo(nombre, raza, f, i, vmax, Dios);
        entrada.close();

        System.out.println("Ahora los magos y los clerigos van a interactuar. Mostrando los datos de cada personaje.");

        magos[0].aprendeHechizo("1");
        magos[0].aprendeHechizo("2");
        magos[1].aprendeHechizo("1");

        magos[0].imprimir();
        magos[1].imprimir();

        magos[1].lanzaHechizo(magos[0]);
        magos[0].lanzaHechizo(magos[1]);

        clerigo.Curar(magos[1]);
        magos[0].lanzaHechizo(magos[1]);

        magos[0].imprimir();
        magos[1].imprimir();
        clerigo.imprimir();

    }

}
