package kolomytsev.course2.one.onemult;

public class Diff extends BinaryExpression{
    public Diff(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int apply() {
        return getLeft().apply() - getRight().apply();
    }

    @Override
    public String toStr() {
        return String.format("(%s - %s)", getLeft().toStr(), getRight().toStr());
    }
}
