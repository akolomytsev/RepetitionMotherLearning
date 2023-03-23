package kolomytsev.course2.one.onemult;

public class Div extends BinaryExpression{
    public Div(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int apply() {
        return getLeft().apply() / getRight().apply();
    }

    @Override
    public String toStr() {
        return String.format("(%s / %s)", getLeft().toStr(), getRight().toStr());
    }
}
