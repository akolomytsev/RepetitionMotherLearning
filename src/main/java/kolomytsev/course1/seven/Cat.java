package kolomytsev.course1.seven;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        while (satiety == false){
            if (p.getFood() >= appetite){
                p.decreaseFood(appetite);
                satiety = true;
                System.out.printf("Кот по имени %s нажрался %n", name);
            } else {
                System.out.printf("Кот по имени %s не жрет сцуко, потому что еды осталось %s%n",name, p.getFood());
                p.increaseFood();
            }
        }



    }
}
