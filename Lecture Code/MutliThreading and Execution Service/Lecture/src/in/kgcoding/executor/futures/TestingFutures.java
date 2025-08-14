package in.kgcoding.executor.futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec= Executors.newFixedThreadPool(3);
FetchName task1=new FetchName("Chakresh");
FetchName task2=new FetchName("Vaishnavi");
FetchName task3=new FetchName("Luffy");
FetchName task4=new FetchName("Sanji");
Future<String> name1=exec.submit(task1);
Future<String> name2=exec.submit(task2);
Future<String> name3=exec.submit(task3);
Future<String> name4=exec.submit(task4);
        System.out.printf("\nFull Name is: %s",name1.get());
        System.out.printf("\nFull Name is: %s",name2.get());
        System.out.printf("\nFull Name is: %s",name3.get());
        System.out.printf("\nFull Name is: %s",name4.get());
        exec.shutdown();
    }
}
