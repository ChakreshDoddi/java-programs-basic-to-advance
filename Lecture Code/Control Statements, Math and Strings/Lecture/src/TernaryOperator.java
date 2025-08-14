import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to number checker\n\n");
        System.out.println("Please enter your first number: ");
        int num1=sc.nextInt();
        System.out.println("Please enter your second number: ");
        int num2=sc.nextInt();
//        int greaterNumber;
//        if(num1>num2){
//            greaterNumber=num1;
//        }
//        else{
//            greaterNumber=num2;
//        }
        int greaterNumber= num1>num2?num1:num2;
        System.out.println(greaterNumber+" is the greatest number");
    }
}
