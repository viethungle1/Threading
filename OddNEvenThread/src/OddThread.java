public class OddThread implements Runnable {
    private String name;
    public OddThread() {
    }

    public OddThread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2!=0) {
                    Thread.sleep(10);
                    System.out.println(this.name +" - "+ i);
                }
            }
        }catch (InterruptedException e) {
            e.fillInStackTrace();
        }
    }
}
