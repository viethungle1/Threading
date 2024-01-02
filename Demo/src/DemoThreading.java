public class DemoThreading implements Runnable {
    private String name;
    public DemoThreading(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " " + i);
        }
    }
}
