import java.util.Scanner;

class EvenOddBitwise {
     public static void main(String[] args) {

                 Scanner sc= new Scanner(System.in);
                 System.out.println("Welcome to Even Odd calculator using bitwise operator ");
                 System.out.println("Please enter any number: ");
                 int a=sc.nextInt();
                 int result=a&1;
         if (result == 1) {
             System.out.println("Given number is odd");
         }
         else{
             System.out.println("Given number is even");
         }
             }
         }