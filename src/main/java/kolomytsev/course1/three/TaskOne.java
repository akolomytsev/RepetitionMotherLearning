package kolomytsev.course1.three;

import java.util.Scanner;

//Написать программу, которая загадывает случайное число от 0 до 9
// и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
// чем загаданное, или меньше. После победы или проигрыша выводится запрос –
// «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class TaskOne {
    static int max = 9;
    static int min = 0;
    static int f;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int rnd = rnd(min, max);
        System.out.println(rnd);


        System.out.println("Отгадай число от 0 до 9 включительно");
        System.out.println("Тебе дано 3 попытки");
        System.out.println("Введи число");
        XXX(rnd);
    }

    public static int rnd(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max)-min;
    }

    public static void XXX(int rnd){
        for (int i = 0; i < 3; i++) {
            while (!scanner.hasNextInt()){
                System.out.println("Это явно не число");
                scanner.next();
            }
            f = scanner.nextInt();
            if (rnd == f){
                System.out.println("Поздравляем, вы угадали!!!");
                break;
            }else {
                System.out.println("Попробуйте еще раз");
            }
        }



    }


}
