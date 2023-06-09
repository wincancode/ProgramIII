import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Inicializacion de variables

        String nombre, cedula, matricula, posicionAmarre;
        float eslora, potenciaCV;
        int numeroMastiles, numeroCamarotes;
        int dia, mes, anio;
        Barco[] barcos = new Barco[3];
        Alquiler alquileres[] = new Alquiler[3];

        // Apertura del Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente");
        nombre = scanner.nextLine();

        System.out.println("Ingrese la cedula del cliente");
        cedula = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, cedula);

        for (int i = 0; i < barcos.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Va a ingresar un velero");
                    break;

                case 1:

                    System.out.println("Va a ingresar un yate de lujo");
                    break;

                case 2:

                    System.out.println("Va a ingresar un deportivo a motor");
                    break;

                default:
                    break;
            }

            System.out.println("Ingrese la matricula del barco");
            matricula = scanner.nextLine();

            System.out.println("Ingrese la eslora");
            eslora = Float.parseFloat(scanner.nextLine());

            System.out.println("Ingrese el dia, mes y anio de fabricacion por separado");
            dia = Integer.parseInt(scanner.nextLine());
            mes = Integer.parseInt(scanner.nextLine());
            anio = Integer.parseInt(scanner.nextLine());

            LocalDate fecha = LocalDate.of(mes, anio, dia);

            switch (i) {
                case 0:
                    System.out.println("Ingrese el numero de mastiles");
                    numeroMastiles = Integer.parseInt(scanner.nextLine());
                    barcos[0] = new Velero(matricula, eslora, fecha, numeroMastiles);
                    break;

                case 1:

                    System.out.println("Ingrese la potencia en CV");
                    potenciaCV = Float.parseFloat(scanner.nextLine());
                    System.out.println("Ingrese el numero de camarotes");
                    numeroCamarotes = Integer.parseInt(scanner.nextLine());
                    barcos[1] = new YateDeLujo(matricula, eslora, fecha, potenciaCV, numeroCamarotes);
                    break;

                case 2:

                    System.out.println("Ingrese la potencia en CV");
                    potenciaCV = Float.parseFloat(scanner.nextLine());
                    barcos[2] = new DeportivoAMotor(matricula, eslora, fecha, potenciaCV);
                    break;

                default:
                    break;

            }

            System.out.println("Ingrese la posicion de amarre");
            posicionAmarre = scanner.nextLine();
            System.out.println("Ingrese la fecha de inicio del alquiler");
            dia = Integer.parseInt(scanner.nextLine());
            mes = Integer.parseInt(scanner.nextLine());
            anio = Integer.parseInt(scanner.nextLine());
            LocalDate fechaInicio = LocalDate.of(mes, anio, dia);
            System.out.println("Ingrese la fecha de fianlizacion del alquiler");
            dia = Integer.parseInt(scanner.nextLine());
            mes = Integer.parseInt(scanner.nextLine());
            anio = Integer.parseInt(scanner.nextLine());
            LocalDate fechaFinal = LocalDate.of(mes, anio, dia);

            alquileres[i] = new Alquiler(fechaInicio, fechaFinal, posicionAmarre, barcos[i], 100, cliente);
        }

        System.out.println("Los alquileres son: ");
        for (int i = 0; i < alquileres.length; i++) {
            barcos[i].imprimir();
            System.out.println("Alquiler " + (i + 1) + ": " + alquileres[i].getCosto());
        }

        scanner.close();
    }
}