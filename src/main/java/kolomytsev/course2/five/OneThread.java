package kolomytsev.course2.five;

public class OneThread {
    public void one(float []arr){
        long b = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        //System.out.println(System.currentTimeMillis() - b);
    }

}
