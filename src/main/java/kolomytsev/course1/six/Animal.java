package kolomytsev.course1.six;

public abstract class Animal {
    private CounterAnimal counterAnimal;
    private String name;
    private int maxRun;
    private int maxSwim;

    public String getName() {
        return name;
    }

    public Animal(CounterAnimal counterAnimal, String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.counterAnimal = counterAnimal;
        counterAnimal.incrementAnimal();
    }

    public CounterAnimal getCounter() {
        return counterAnimal;
    }

    public void run(int a){
        if (a < maxRun){
            System.out.printf("%s run distance %s%n", name, a);
        } else
            System.out.printf("%s не смог пробежать %n", name);
    }
    public void swim(int b){
        if (b < maxSwim){
            System.out.printf("%s swim distance %s%n", name, b);
        } else
            System.out.printf("%s не смог доплыть %n", name);
    }

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                '}';
//    }

//    public Animal(String name) {
//        this.name = name;
//    }
}
