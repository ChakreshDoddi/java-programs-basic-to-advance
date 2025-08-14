package in.kgcoding.challenge99;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.printf("Hello from %s\n",Thread.currentThread().getName());

        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
    }
}
