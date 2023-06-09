public class Ticket {
    private int a;
    private int b;

    public static int total;

    static {
        total = 0;
    }

    public Ticket(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void imprimir() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Ticket.total = total;
    }
}
