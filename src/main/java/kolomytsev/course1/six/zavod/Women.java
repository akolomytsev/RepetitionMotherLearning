package kolomytsev.course1.six.zavod;

public class Women extends SKB{

    public Women(Counter counter, String name, int drink) {

        super(counter, name, 3000, 50, drink);
        counter.womenCounter();
}
}
