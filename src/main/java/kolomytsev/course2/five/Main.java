package kolomytsev.course2.five;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];
    public static void main(String[] args) {
//        long a = System.currentTimeMillis();
//        OneThread oneThread = new OneThread();
//        oneThread.one(size,arr);
//        System.out.println(System.currentTimeMillis() - a);
//
        long b = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);


        Thread[] threads = new Thread[2];

        threads[0] = new Thread(new Multithreading(a1));
        threads[1] = new Thread(new Multithreading(a2));

        threads[0].start();
        threads[1].start();



        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - b);
    }

}
