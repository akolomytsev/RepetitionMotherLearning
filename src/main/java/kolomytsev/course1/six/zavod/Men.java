package kolomytsev.course1.six.zavod;

public class Men extends SKB{

    public Men(Counter counter, String name, int drink) {

        super(counter, name,5000, 100, drink);
        counter.menCounter();
    }
}
