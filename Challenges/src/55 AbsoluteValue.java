import java.util.Scanner;

class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to absolute value calculator:\n\n");
        System.out.println("Please enter your number: ");
        int num=sc.nextInt();
        int abs=num>=0?num:-num;
        System.out.println("Absolute value of your number is "+abs);
    }
}
