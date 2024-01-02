
public class Main {
    public static void main(String[] args) {
        OddThread o1 = new OddThread("O");
        Thread to = new Thread(o1);
        EvenThread e1 = new EvenThread("E");
        Thread te = new Thread(e1);
        to.start();
        try {
            to.join();
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
        te.start();



    }
}