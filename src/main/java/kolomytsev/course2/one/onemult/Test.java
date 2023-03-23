package kolomytsev.course2.one.onemult;

public class Test {

    public static void main(String[] args) {
        new Div(new Diff(new Sum(new Argument(4), new Argument(6)), new Argument(2)),
                new Diff(new Sum(new Argument(1), new Argument(3)), new Argument(0))).eval();
    }
}
