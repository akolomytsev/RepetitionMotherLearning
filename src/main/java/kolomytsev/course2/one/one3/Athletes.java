package kolomytsev.course2.one.one3;

public interface Athletes extends Run, Jump {

    String getName();

    boolean obstacle(Obstacle... obstacles);
}
