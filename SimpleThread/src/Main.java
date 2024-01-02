public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("A");
        NumberGenerator num2 = new NumberGenerator("B");
        Thread t1 = new Thread(num1);
        Thread t2 = new Thread(num2);
        t1.start();
        t2.start();
    }
}