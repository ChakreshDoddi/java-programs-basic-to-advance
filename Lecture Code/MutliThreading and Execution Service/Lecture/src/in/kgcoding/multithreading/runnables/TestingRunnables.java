package in.kgcoding.multithreading.runnables;

public class TestingRunnables {
    public static void main(String[] args) throws InterruptedException{
        PrintTask t1=new PrintTask('*');
        PrintTask t2=new PrintTask('$');
        PrintTask t3=new PrintTask('#');
        Thread p1=new Thread(t1);
        System.out.println( p1.getState());
        p1.start();
        System.out.println(p1.getState());
        p1.join();

        System.out.println();
        new Thread(t2).start();
        new Thread(t3).start();
        System.out.println(p1.getState());
    }
}
