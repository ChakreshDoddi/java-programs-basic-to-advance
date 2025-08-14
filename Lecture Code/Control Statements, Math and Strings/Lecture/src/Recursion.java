import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to factorial calculator:\n\n");
        System.out.println("Please enter your number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long fact=factorial(num);
        System.out.println("Your factorial is "+fact);
    }
    public static long factorial(int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
