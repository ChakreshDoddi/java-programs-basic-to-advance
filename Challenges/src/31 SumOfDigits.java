import java.util.Scanner;

class SumOfDigits {
     public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          System.out.println("Welcome to Sum of Digits Calculator: \n");
          System.out.println("Please enter any number: ");
          int num=sc.nextInt();
          int sum=0;
          while(num>0){
               sum+=num%10;
               num=num/10;
          }
          System.out.println(sum);
     }
}
