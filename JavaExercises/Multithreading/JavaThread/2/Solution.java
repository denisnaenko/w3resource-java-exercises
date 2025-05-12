class Controller {
    static boolean isEvenTurn = true;
    static final Object lock = new Object();
}

class EvenThread implements Runnable {
    Thread t;

    public EvenThread() {
        t = new Thread(this);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 20; i += 2) {
                synchronized (Controller.lock) {
                    while (!Controller.isEvenTurn) {
                        Controller.lock.wait();
                    }

                    System.out.println(i);
                    Controller.isEvenTurn = false;
                    Controller.lock.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    static EvenThread StartEvenThread() {
        EvenThread th = new EvenThread();
        th.t.start();
        return th;
    }
}

class OddThread implements Runnable {
    Thread t;

    public OddThread() {
        t = new Thread(this);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i += 2) {
                synchronized (Controller.lock) {
                    while (Controller.isEvenTurn) {
                        Controller.lock.wait();
                    }

                    System.out.println(i);
                    Controller.isEvenTurn = true;
                    Controller.lock.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    static OddThread StartOddThread() {
        OddThread th = new OddThread();
        th.t.start();
        return th;
    }
}

public class Solution {
    public static void main(String[] args) {
        EvenThread thEven = EvenThread.StartEvenThread();
        OddThread thOdd = OddThread.StartOddThread();

        try {
            thEven.t.join();
            thOdd.t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
