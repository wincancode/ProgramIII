public class ParCartesiano {
    private Object x;
    private Object y;

    public ParCartesiano(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x.toString() + "," + y.toString() + ")";
    }

}
