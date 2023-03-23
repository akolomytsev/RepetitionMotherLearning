package kolomytsev.course1.seven;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.println("Еды осталось: " + food);
    }

    public void decreaseFood(int n){
            food -= n;
        }

    public void  increaseFood(){
        System.out.println("Напишите сколько еды добавить");
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        food += x;
    }
}
