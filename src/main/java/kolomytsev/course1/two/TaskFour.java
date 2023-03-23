package kolomytsev.course1.two;

public class TaskFour {
    public static void main(String[] args) {
        int[][] k = new int[10][10];
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                if (i == j || k.length - i - 1 == j){
                    k[i][j] = 1;
                }
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }
    }
}
