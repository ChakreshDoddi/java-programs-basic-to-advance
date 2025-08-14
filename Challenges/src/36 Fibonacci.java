import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Printing Fibonacci series up to given number: ");
        System.out.println("Please enter your number: ");
       int num=sc.nextInt();
        System.out.println("Here is the fibonacci series: ");
        fibSeries(num);

    }
    public static void fibSeries(int num){
        if(num<0)return;
        System.out.print("0 ");
        if(num==0)return;
        System.out.print("1 ");
        int first=0;
        int second=1;
        while(first+second<=num){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }

    }
}
