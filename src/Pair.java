
public class Pair <T> implements Cloneable {

    private T t1;
    private T t2;

    public Pair() {}

    public Pair(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T getT1() {
        return t1;
    }

    public T getT2() {
        return t2;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    public void testMethod() {
        System.out.println("Test method!");
    }


    @Override
    public String toString() {
        return "T1 : " + t1 + ", T2: " + t2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }
}
