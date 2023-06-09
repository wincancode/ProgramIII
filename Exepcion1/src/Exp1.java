public class Exp1 {
    public static void main(String[] args) throws Exception {
        String[] Arreglo = { "1", "Dos", "3", "4", "5" };

        int i, sum = 0;
        try {

            for (i = 0; i < Arreglo.length; i++) {
                sum += Integer.parseInt(Arreglo[i]);
            }

            System.out.println(sum);

        } catch (NumberFormatException e) {
            System.out.println(sum);
        }

    }
}
