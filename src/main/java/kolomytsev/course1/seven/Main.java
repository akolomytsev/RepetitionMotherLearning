package kolomytsev.course1.seven;

public class Main {
    public static void main(String[] args) {
        Cat[] mydili = new Cat[5];
        mydili[0] = new Cat("Мурзик1", 15, false);
        mydili[1] = new Cat("Мурзик2", 15, false);
        mydili[2] = new Cat("Мурзик3", 15, false);
        mydili[3] = new Cat("Мурзик4", 60, false);
        mydili[4] = new Cat("Мурзик5", 15, true);
        Plate plate = new Plate(100);

        plate.info();
        for (Cat cat : mydili) {
            cat.eat(plate);
        }

        plate.info();
    }
}
