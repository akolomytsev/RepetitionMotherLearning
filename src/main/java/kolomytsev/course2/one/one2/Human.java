package kolomytsev.course2.one.one2;

public class Human implements Participant{
    private final String name;
    private static int counter = 0;
    private static int jumpLimit = ((int) (Math.random() * 100) +50);
    private static int runLimit = ((int) (Math.random() * 100) +50);

    public Human() {
        counter++;
        name = counter + "clone";
    }

    @Override
    public int jump() {
        return jumpLimit;
    }

    @Override
    public int run() {
        return runLimit;
    }

    @Override
    public String getName() {
        return name;
    }
}
