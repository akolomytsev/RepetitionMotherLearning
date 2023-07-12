package kolomytsev.course2.six;

public class Utils {

    static Thread handleInThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
        return thread;
    }
}
