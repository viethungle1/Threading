public class Main {
    public static void main(String[] args) {
        DemoThreading a = new DemoThreading("A");
        DemoThreading b = new DemoThreading("B");
        DemoThreading c = new DemoThreading("C");
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }
}