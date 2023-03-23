package kolomytsev.course2.one.onemult;

public interface Expression {

    int apply();
    default void eval() {}
    String toStr();

}