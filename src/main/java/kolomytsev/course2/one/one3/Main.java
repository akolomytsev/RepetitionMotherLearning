package kolomytsev.course2.one.one3;

public class Main {
    public static void main(String[] args) {
        Athletes[] athletes = {
                new Human(),
                new Cat(),
                new Robot()
        };

        Obstacle[] obstacles = {
                new Pit(),
                new Distance()
        };

        for (Athletes athletes1 : athletes) {
            for (Obstacle obstacle : obstacles) {
                if (!athletes1.obstacle(obstacle)) {
                    System.out.println("Сошел с дистанции");
                    break;
                }
            }
        }
    }
}
