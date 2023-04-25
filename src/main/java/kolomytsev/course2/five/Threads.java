package kolomytsev.course2.five;

public class Threads {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    public static void main(String[] args) {
        OneThread oneThread = new OneThread();
        oneThread.one(size,arr);


    }

}
