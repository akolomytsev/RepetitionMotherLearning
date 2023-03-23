package kolomytsev.course1.two;

//Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
public class TaskSix {
    public static void main(String[] args) {
        int[] g = {5, 5, 5, 15};
        for (int i = 0; i < g.length ; i++) {
            int a = 0;
            int b = 0;
            for (int j = 0; j < i ; j++) {
                a += g[j];
                System.out.print(a +"t" + " ");
            }
            System.out.println("g");
            for (int j = i; j < g.length; j++) {
                b += g[j];
                System.out.print(b + "b" + " ");
            }
            if (a == b){
                System.out.println("Жопа" + a + " " + b);
            }
        }
        System.out.println(checkBalance(g));
    }
    static boolean checkBalance ( int[] g){
        int leftsum, rightsum;
        for (int i = 0; i < g.length; i++) {
            leftsum = 0;
            rightsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum += g[j];
                System.out.print(leftsum + "m ");
            }
            System.out.println("l");
            for (int j = i; j < g.length; j++) {
                rightsum += g[j];
                System.out.print(rightsum + "t ");
            }
            if (leftsum == rightsum){
                return true;
            }
        }

        return false;
    }
}
