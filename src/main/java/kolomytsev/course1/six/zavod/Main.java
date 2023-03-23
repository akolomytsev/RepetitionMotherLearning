package kolomytsev.course1.six.zavod;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Women sveta = new Women(counter, "Света", 10);
        System.out.println("Всего женщин участвовало: " + sveta.getCounter().getWomenCounter());
        System.out.println("Всего людей участвовало: " + sveta.getCounter().getPeopleCounter());
        Women sveta1 = new Women(counter, "Света", 10);
        Men lexa = new Men(counter, "Леша", 3);
        System.out.println("Всего мужчин участвовало: " + sveta.getCounter().getMenCounter());
        System.out.println("Всего людей участвовало: " + lexa.getCounter().getPeopleCounter());

        sveta.run(190, 1);
        sveta.swim(1200);
        lexa.swim(30);
        lexa.run(1000, 1);

    }
}
