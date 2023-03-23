package kolomytsev.course2.one;

public class Treadmill implements Obstacle{
    private final int height = (int) (Math.random()*100+1);

    @Override
    public boolean performAction(Participant participant) {
        if (height <= participant.run()){
            System.out.println(participant.getName() + " смог");
            return true;
        }
        System.out.println(participant.getName() + " не смог");
        return false;
    }
}
