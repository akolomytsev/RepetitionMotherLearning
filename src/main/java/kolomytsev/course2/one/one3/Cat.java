package kolomytsev.course2.one.one3;

public class Cat implements Athletes {
    private final String name;
    private static int counter;
    private final int jumpLimit = (int) (Math.random() * 100) + 50;
    private final int runLimit = (int) (Math.random() * 100) + 40;

    public Cat() {
        counter++;
        name = "Cat # " + counter;
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
    public boolean obstacle(Obstacle... obstacles) {
        for (Obstacle obstacle : obstacles) {
            if (obstacle.action(this)) {
                System.out.printf("Атлет с именем %s пробежал дистанцию длинной %s%n", name, obstacle.getSize());
                return true;
            }
            System.out.printf("Атлет с именем %s не пробежал дистанцию длинной %s%n", name, obstacle.getSize());
            return false;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
