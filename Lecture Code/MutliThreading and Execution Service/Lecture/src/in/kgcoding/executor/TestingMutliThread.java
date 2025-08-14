package in.kgcoding.executor;

import in.kgcoding.multithreading.threads.PrintTask;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingMutliThread {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(10);
        for (int i = 0; i < 6; i++) {
            PrintTask task=new PrintTask((char)i);
            executor.submit(task);
        }
        executor.shutdown();
    }
}
