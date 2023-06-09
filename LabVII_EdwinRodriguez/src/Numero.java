
public class Numero implements RelacionOrden {
    private double num;

    @Override
    public void comparar(Object elemento) {

        double num2 = ((Numero) elemento).num;

        System.out.println("\nNumero 1 " + num);
        System.out.println("Numero 2 " + num2);

        if (num > num2)
            System.out.println("El numero 1 es mayor al numero 2");
        if (num < num2)
            System.out.println("El numero 1 es menor al numero 2");
        if (num == num2)
            System.out.println("El numero 1 es igual al numero 2");
            
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public Numero(double num) {
        this.num = num;
    }

}
