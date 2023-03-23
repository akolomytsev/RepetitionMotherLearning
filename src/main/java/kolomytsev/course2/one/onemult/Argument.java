package kolomytsev.course2.one.onemult;

public class Argument implements Expression{
    private final int x;

    public Argument(int x) {
        this.x = x;
    }

    @Override
    public int apply() {
        return x;
    }

    @Override
    public String toStr() {
        return String.valueOf(x);
    }
}
