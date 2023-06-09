public class AppVI {

    public static void main(String[] args) throws Exception {

        Piscina piscina = new Piscina(10);

        piscina.llenar(5);

        System.out.println(piscina.getNivel());

        try {
            piscina.llenar(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            piscina.vaciar(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        piscina.vaciar(3);

        piscina.llenar(4);

        System.out.println(piscina.getNivel());

    }
}
