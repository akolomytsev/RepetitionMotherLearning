package kolomytsev.course1.one;

public class Init {
    public static void main(String[] args) {
        byte b = 5;
        short s = 12;
        int i = 123;
        long l = 987;
        float f = 123.321f;
        double d = 321.123d;
        char c = 'c';
        String g = "no";

        float g1 = TaskOne.exampleOne(f, f, f, f);
        System.out.println(g1);

        boolean w = TaskTwo.within(5,2);
        System.out.println(w);

        String z = TaskFive.taskFife(-5);
        System.out.println(z);

        boolean w2 = TaskSix.taskSix(-5);
        System.out.println(w2);

        String s2 = TaskSeven.name("Пидр");
        System.out.println("Привет " + s2);

        boolean s3 = TaskEight.taskEight(2004);
        System.out.println(s3);
    }



}
