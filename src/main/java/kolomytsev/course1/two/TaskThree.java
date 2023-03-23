package kolomytsev.course1.two;

public class TaskThree {
    public static void main(String[] args) {
        int[] m = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < m.length; i++) {
            if (m[i] < 6){
                m[i] = m[i]*2;
            }
            System.out.print(m[i] + " ");
        }
    }
}
