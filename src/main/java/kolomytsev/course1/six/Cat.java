package kolomytsev.course1.six;

public class Cat extends Animal{
    public Cat(CounterAnimal counter, String name) {
        super(counter, name, 200, 0);
        counter.incrementCat();
    }

    @Override
    public void swim(int b) {
        System.out.printf("%s не умеет плавать", getName());
    }
}
