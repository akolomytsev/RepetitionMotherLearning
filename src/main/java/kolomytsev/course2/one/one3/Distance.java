package kolomytsev.course2.one.one3;

public class Distance implements Obstacle {
    private final int size = (int) (Math.random() * 100 + 1);

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean action(Athletes athletes) {
        return size > athletes.run();
    }
}
