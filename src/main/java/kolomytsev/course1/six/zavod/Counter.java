package kolomytsev.course1.six.zavod;

public class Counter {
    private int womenCounter;
    private int menCounter;
    private int peopleCounter;

    public void womenCounter(){
        womenCounter++;
    }
    public void menCounter(){
        menCounter++;
    }
    public void peopleCounter(){
        peopleCounter++;
    }

    public int getWomenCounter() {
        return womenCounter;
    }

    public int getMenCounter() {
        return menCounter;
    }

    public int getPeopleCounter() {
        return peopleCounter;
    }
}
