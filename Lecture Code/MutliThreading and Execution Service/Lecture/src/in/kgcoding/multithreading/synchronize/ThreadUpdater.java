package in.kgcoding.multithreading.synchronize;

public class ThreadUpdater extends Thread{
    private final Counter counter;

    public ThreadUpdater(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
