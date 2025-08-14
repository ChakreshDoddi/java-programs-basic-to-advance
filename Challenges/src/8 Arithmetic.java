import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to perform arithmetic operations:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition of given two numbers are: "+(a+b));
        System.out.println("Subraction of given two numbers are: "+(a-b));
        System.out.println("Mutlplication of given two numbers are: "+(a*b));
        System.out.println("Division of given two numbers are: "+(a/b));
    }
}
