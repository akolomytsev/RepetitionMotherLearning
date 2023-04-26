package kolomytsev.course2.five;

public class Multithreading implements Runnable{
//    static final int size = 10000000;
//    static final int h = size / 2;
//    static float[] arr = new float[size];
    float[] a;
//    float[] a2;

    public Multithreading(float[] a) {
        this.a = a;
    }

    @Override
    public void run() {
        //long a = System.currentTimeMillis();
//        for (int i = 0; i < size; i++) {
//            arr[i] = 1;
//        }
        //System.out.println(System.currentTimeMillis() - a);
        long b = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            a[i] = (float)(a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - b);
    }

}
