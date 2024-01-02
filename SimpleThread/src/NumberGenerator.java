public class NumberGenerator implements Runnable {
    private String name;


    public NumberGenerator() {
    }

    public NumberGenerator(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <10 ; i++) {
                System.out.println(this.name+ " number " + i);
                int j = hashCode();
                System.out.println(j);
            }
                Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);}
    }
}
