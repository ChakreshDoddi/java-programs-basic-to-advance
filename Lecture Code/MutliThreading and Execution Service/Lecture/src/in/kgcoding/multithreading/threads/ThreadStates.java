package in.kgcoding.multithreading.threads;

public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Inside run: " + Thread.currentThread().getState());
        });
        System.out.println("Before start: " + t.getState());  // NEW
        t.start();
        System.out.println("After start: " + t.getState());   // RUNNABLE (or RUNNING)
        /* Inside run will print RUNNABLE too */
        t.join();  // main thread waits—t moves to TERMINATED
        System.out.println("After join: " + t.getState());
    }
}
