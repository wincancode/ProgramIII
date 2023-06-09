import java.util.ArrayList;

public class ListaCantantesFamosos {
    private ArrayList<CantanteFamoso> listaCantantesFamosos = new ArrayList<>();

    public ListaCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        this.listaCantantesFamosos = listaCantantesFamosos;

    }

    /*
     * Crear una aplicación que permita gestionar información de cantantes famosos.
     * Se pide
     * desarrollar una clase denominada ListaCantantesFamosos que disponga de un
     * atributo
     * ArrayList listaCantantesFamosos que almacene objetos de tipo CantanteFamoso.
     * La clase debe
     * contener los métodos Agregar, eliminar, buscar, tamaño, imprimir. Un objeto
     * de tipo
     * CantanteFamoso tendrá como atributos nombre del cantante, nombre del disco
     * con más Venta,
     * año de emisión, duración del disco en minutos. Se pide mostrar información de
     * los cantantes
     * famosos por pantalla. Se debe pedir al usuario los datos requeridos por
     * cantante famoso y una
     * vez introducidos los datos mostrar la lista actualizada. Una vez mostrada la
     * lista actualizada, se
     * debe dar opción a elegir entre volver a introducir los datos de otro cantante
     * o salir del programa
     * (se podrán introducir tantos datos de cantantes como se desee. Para ello usa
     * un bucle while que
     * dé opción a elegir al usuario).
     */

    public ListaCantantesFamosos() {
    }

    public ArrayList<CantanteFamoso> getListaCantantesFamosos() {
        return listaCantantesFamosos;
    }

    public void setListaCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        this.listaCantantesFamosos = listaCantantesFamosos;
    }

    public void agregar(CantanteFamoso cantanteFamoso) {
        listaCantantesFamosos.add(cantanteFamoso);
    }

    public void eliminar(CantanteFamoso cantanteFamoso) {
        listaCantantesFamosos.remove(cantanteFamoso);
    }

    public CantanteFamoso buscar(String nombre) {
        for (int i = 0; i < listaCantantesFamosos.size(); i++) {
            CantanteFamoso cantanteFamoso = listaCantantesFamosos.get(i);
            if (cantanteFamoso.getNombre().equals(nombre)) {
                return cantanteFamoso;
            }
        }
        return null;
    }

    public int tamaño() {
        return listaCantantesFamosos.size();
    }

    /**
     * Listar: Lista los elementos segun un tipo de ordenamiento
     * 
     * @param ordenamiento 1: ordena por nombre 2: ordena por nombre del disco con
     *                     más ventas 3: ordena por año de emisión 4: ordena por
     *                     duración del disco
     */
    public void Listar(int ordenamiento) {

    }

}
