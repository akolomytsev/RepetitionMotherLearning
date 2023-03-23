package kolomytsev.course2.one;

public class Cat implements Participant{
    private final String name;
    private static int counter = 0;
    private final int jumpingAbility = (int) (Math.random()*100+1+50);

    private final int endurance = (int) (Math.random()*100+1+50);
    public Cat() {
        counter++;
        name = "Cat " + counter;
    }

    @Override
    public int jump() {
        return jumpingAbility;
    }

    @Override
    public int run() {
        return endurance;
    }

    @Override
    public String getName() {
        return name;
    }
}
