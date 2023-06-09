public class App {
    public static void main(String[] args) throws Exception {

        Almacen almacen = new Almacen<>(5);

        ObjetoGuardable objetosGuardables[] = new ObjetoGuardable[6];

        objetosGuardables[0] = new ObjetoGuardable<>(1, 1);
        objetosGuardables[1] = new ObjetoGuardable<>(2, 2);
        objetosGuardables[2] = new ObjetoGuardable<>(3, 3);
        objetosGuardables[3] = new ObjetoGuardable<>(4, 4);
        objetosGuardables[4] = new ObjetoGuardable<>(5, 5);
        objetosGuardables[5] = new ObjetoGuardable<>(5, 6);

        almacen.ingresarObjeto(objetosGuardables[0]);
        almacen.ingresarObjeto(objetosGuardables[1]);
        almacen.ingresarObjeto(objetosGuardables[2]);
        almacen.ingresarObjeto(objetosGuardables[3]);
        almacen.ingresarObjeto(objetosGuardables[4]);
        almacen.ingresarObjeto(objetosGuardables[5]);

        almacen.imprimir();

        Object objeto = almacen.sacarObjeto(1);

        System.out.println("\nObjeto sacado: " + objeto.toString() + "\n");

        almacen.imprimir();
    }
}
