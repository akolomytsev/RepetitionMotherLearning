package kolomytsev.course2.five;

public class OneThread {
    public void one(int size, float []arr){
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long b = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        //System.out.println(System.currentTimeMillis() - b);
    }
}
