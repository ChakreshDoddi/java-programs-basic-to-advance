package in.kgcoding.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingPrint {
    public static void main(String[] args) {
        try (ExecutorService exec = Executors.newSingleThreadExecutor()) {
            PrintNumbers task = new PrintNumbers();
            exec.submit(task);
            exec.shutdown();
        }

    }
}
