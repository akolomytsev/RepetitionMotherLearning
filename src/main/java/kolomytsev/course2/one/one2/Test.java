package kolomytsev.course2.one.one2;

public class Test {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human(),
                new Cat()
        };

        Obstacle[] obstacles = {
                new Wall(),
                new Road()
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle: obstacles) {
                if (!obstacle.passedTheObstacle(participant)){
                    break;
                }

            }

        }
    }
}
