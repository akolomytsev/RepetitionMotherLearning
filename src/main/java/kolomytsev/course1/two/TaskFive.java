package kolomytsev.course1.two;

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {
        int[] f = {15, 135, 5, 13};
        System.out.println(Arrays.stream(f).max());
    }
}
