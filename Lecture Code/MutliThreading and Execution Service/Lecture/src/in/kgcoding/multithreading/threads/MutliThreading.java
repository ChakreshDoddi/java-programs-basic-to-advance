package in.kgcoding.multithreading.threads;

public class MutliThreading {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d*",i);
        }
        System.out.println("\n* task complete");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$",i);
        }
        System.out.println("\n$ task complete");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d&",i);
        }
        System.out.println("\n& task complete");
     long endTime=System.currentTimeMillis();
        System.out.printf("Execution time is: %d",endTime-startTime);
    }
    }

