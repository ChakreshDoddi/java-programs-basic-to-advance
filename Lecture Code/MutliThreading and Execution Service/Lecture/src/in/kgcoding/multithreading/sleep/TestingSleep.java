package in.kgcoding.multithreading.sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Brewing tea... please wait.");
       Thread.sleep(3000);
        System.out.println("Tea is ready. Enjoy!");
    }
}
