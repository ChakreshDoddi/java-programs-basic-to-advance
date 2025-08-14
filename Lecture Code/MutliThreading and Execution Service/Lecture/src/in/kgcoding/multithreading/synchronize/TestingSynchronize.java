package in.kgcoding.multithreading.synchronize;

public class TestingSynchronize {
    public static void main(String[] args) {
        Counter counter=new Counter();
        ThreadUpdater t1=new ThreadUpdater(counter);
        ThreadUpdater t2=new ThreadUpdater(counter);

        try{
            t1.start();

            t2.start();
            t1.join();
        t2.join();}
        catch (InterruptedException e){
            System.out.println("Thread Interrupted "+e.getMessage());
        }
        System.out.println("Final counter value is: "+counter.getCount());
    }
}
