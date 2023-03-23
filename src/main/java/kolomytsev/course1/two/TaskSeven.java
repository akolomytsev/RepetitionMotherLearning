package kolomytsev.course1.two;

//смещение массива в какую либо сторону

public class TaskSeven {
    public static void main(String[] args) {
        int a = -1;
        int[] q = {4, 3, 21, 5, 1};
        for (int j : q) {
            System.out.print(j + " ");
        }
        System.out.println();
        offset(q, a);
    }

    static void offset(int[] q, int a) {
        int b;
        if (a > 0) {
            for (int i = q.length; i > 0; i--) {
                b = (i + Math.abs(a)) % q.length; //
                System.out.print(q[b] + " ");
            }
            System.out.println();
        } else if (a < 0) {
            for (int i = 0; i < q.length; i++) {
                b = (i + Math.abs(a)) % q.length; //
                System.out.print(q[b] + " ");
            }
        }
    }
}
