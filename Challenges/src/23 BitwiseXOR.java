import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Bitwise XOR(^) calculator of two numbers: \n ");
        System.out.println("Please enter any two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a^b;
        System.out.println("So bitwise XOR of given two numbers are: "+c);
    }
}
