import java.util.Scanner;

class BitwiseNOT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Bitwise NOT(&) calculator of two numbers: \n ");
        System.out.println("Please enter any number: ");
        int a=sc.nextInt();
        int b=~a;
        System.out.println("So bitwise NOT of given number is: "+b);
    }
}
