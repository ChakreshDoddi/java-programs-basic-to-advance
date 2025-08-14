package in.kgcoding.multithreading.threads;

public class PrintTask extends Thread{
    public void run(){
        for (int i = 1; i <=1000; i++) {
            System.out.printf("%c%d, ", targetChar,i);
        }
        System.out.printf("\n%c Task Done, %s\n",targetChar,Thread.currentThread().getName());
    }
    private final char targetChar;
    public PrintTask(char targetChar){
        this.targetChar=targetChar;
    }

    public static void main(String[] args) {
        PrintTask p1=new PrintTask('&');
        p1.start();
        PrintTask p2=new PrintTask('*');
        p2.start();

    }
}
