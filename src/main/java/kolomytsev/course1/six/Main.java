package kolomytsev.course1.six;

public class Main {
    public static void main(String[] args) {
        CounterAnimal counterAnimal = new CounterAnimal();
        Cat kitty = new Cat(counterAnimal, "Vasilisa");
        System.out.println("Всего кошек: " + kitty.getCounter().getCatCounter());
        Dog doggy = new Dog(counterAnimal, "Barmalei");
        System.out.println("Всего собак" + doggy.getCounter().getDogCounter());
        System.out.println("Всего животных" + kitty.getCounter().getAnimalCounter());

        kitty.run(190);
        doggy.run(450);
        doggy.swim(12);
        kitty.swim(500);
    }

}
