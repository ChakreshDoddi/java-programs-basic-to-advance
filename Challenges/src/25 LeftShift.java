import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("Welcome to showcase of LeftShift Operators: ");
        System.out.println("Please enter any number: ");
        int a=sc.nextInt();
        int result=a<<1;
        System.out.println("Now, LeftShift of given number is "+result);
    }
}
