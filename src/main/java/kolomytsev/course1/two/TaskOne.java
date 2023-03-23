package kolomytsev.course1.two;

public class TaskOne {

    public static void main(String[] args) {
        int[] m = {0,1,0,1,0,1,0};
        for (int k : m) {
            System.out.print(k);
        }
        System.out.println();
        for (int j : m) {
            if (j == 0){
                j = 1;
            } else {
                j = 0;
            }
            System.out.print(m[j]);
        }
    }
}
