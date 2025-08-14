package in.kgcoding.executor.futures;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class FetchName implements Callable<String> {
       private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\n Getting full name of %s from server", name);
        Thread.sleep(4000);
        return name+ " Indian";

    }
}
