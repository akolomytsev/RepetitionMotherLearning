package kolomytsev.course2.five;

public class Multithreading implements Runnable{
    float[] a;
    private final Object monitor;

    public Multithreading(float[] a, Object monitor) {
        this.a = a;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        long bStart = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            synchronized (monitor) {
                a[i] = (float) (a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
        System.out.println(System.currentTimeMillis() - bStart);
    }
}