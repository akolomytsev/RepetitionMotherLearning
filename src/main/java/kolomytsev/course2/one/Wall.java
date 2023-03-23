package kolomytsev.course2.one;

public class Wall implements Obstacle{
    private final int size = (int) (Math.random()*100+1);

    @Override
    public boolean performAction(Participant participant) {
        if (size <= participant.jump()){
            System.out.println(participant.getName() + " смог");
           return true;
        }
        System.out.println(participant.getName() + " не смог");
        return false;
    }
}
