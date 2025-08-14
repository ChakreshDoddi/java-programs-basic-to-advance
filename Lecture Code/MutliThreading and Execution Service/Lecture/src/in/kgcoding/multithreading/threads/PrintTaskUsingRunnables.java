package in.kgcoding.multithreading.threads;

public class PrintTaskUsingRunnables implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d : %c", i,targetChar);
        }
        System.out.printf("\n%c Task Done\n",targetChar);
    }
    private final char targetChar;
    public PrintTaskUsingRunnables(char targetChar){
        this.targetChar=targetChar;
    }

    public static void main(String[] args) {
        PrintTaskUsingRunnables p1=new PrintTaskUsingRunnables('&');
        new Thread(p1).start();
        PrintTaskUsingRunnables p2=new PrintTaskUsingRunnables('$');
        new Thread(p2).start();
    }
}
