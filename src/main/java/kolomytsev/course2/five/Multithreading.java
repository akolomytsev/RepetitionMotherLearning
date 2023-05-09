package kolomytsev.course2.five;

public class Multithreading implements Runnable{
//    static final int size = 10000000;
//    static final int h = size / 2;
//    static float[] arr = new float[size];
    float[] a;
    private final Object monitor;
//    float[] a2;

    public Multithreading(float[] a, Object monitor) {
        this.a = a;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        //System.out.println(System.currentTimeMillis() - a);
        long b = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            synchronized (monitor) {
                a[i] = (float) (a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
        System.out.println(System.currentTimeMillis() - b);


    }

}
