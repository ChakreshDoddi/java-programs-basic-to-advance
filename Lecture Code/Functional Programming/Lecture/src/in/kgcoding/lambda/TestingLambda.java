package in.kgcoding.lambda;

public class TestingLambda {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int sum=sum(5,6);
        TestingLambda s=new TestingLambda();
        s.printString("My name is Chakresh");
    }
    public void printString(String toPrint){
        System.out.println(toPrint);
    }
    public static int sum(int a, int b){
        int sum=a+b;
        return sum;

    }
}
