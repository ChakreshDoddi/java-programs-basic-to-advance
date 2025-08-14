package in.kgcoding.multithreading.yield;

public class TestingYield implements Runnable{
   private final String name;
    public TestingYield(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%s running lap %d%n", name, i);
            // Hint scheduler to let others run
            Thread.yield();
        }
        System.out.printf("%s finished race.%n", name);
    }

    public static void main(String[] args) {

        TestingYield t1=new TestingYield("Runner-1");
        TestingYield t2=new TestingYield("Runner-2");
        Thread r1=new Thread(t1);
        Thread r2=new Thread(t2);
        r1.start();
        r2.start();
    }
}
