package kolomytsev.course1.six.zavod;

public abstract class SKB {
    private Counter counter;
    private String name;
    private int maxRun;
    private int maxSwim;

    private int drunk;

    public Counter getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public SKB(Counter counter, String name, int maxRun, int maxSwim, int drunk) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.drunk = drunk;
        this.counter = counter;
        counter.peopleCounter();
    }
//    public SKB(String name, int maxRun, int maxSwim) {
//        this.name = name;
//        this.maxRun = maxRun;
//        this.maxSwim = maxSwim;
//    }

    public void run(int a, int b){
        if (maxRun > a && drunk > b){
            System.out.printf("Спортсмен с именем %s пробежал дистанцию длинной %sm, так как выпил всего %s%n", name, a, b);
        }else {
            System.out.printf("Спортсмен с именем %s заявился на дистанцию длинной %sm и сдох где то по пути, так как дохлик или выпил больше нормы%n", name, a);
        }

    }

    public void swim(int b){
        if (maxSwim > b){
            System.out.printf("Спортсмен с именем %s проплыл дистанцию длинной %sm%n", name, b);
        }else {
            System.out.printf("Спортсмен с именем %s заявился на дистанцию длинной %sm и утонул где то по пути%n", name, b);
        }
    }



//    public SKB(String name) {
//        this.name = name;
//    }
}
