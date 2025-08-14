package in.kgcoding.multithreading.threads;

public class Mythread extends Thread{
    @Override
    public void run() {
        Thread thread=Thread.currentThread();
        System.out.println("Current thread is "+ thread.getName());
        System.out.println("Current thread Priority "+thread.getPriority());
    }

    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread t2=new Mythread();
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
    }
}
