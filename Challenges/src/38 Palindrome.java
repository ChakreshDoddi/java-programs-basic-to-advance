import java.util.Scanner;

class Palindrome {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Welcome to Palindrome Check Program:  ");
            System.out.println("Please enter a number to check: ");
            int num=sc.nextInt();
            int finalNumber=palindrome(num);
            if(finalNumber==num){
                System.out.println("Given number is palindrome");
            }
            else{
                System.out.println("Given number is not a palindrome");
            }
        }
        public static int palindrome(int num1){
            int newNum=0;
            while(num1>0){
                int digit=num1%10;
                newNum=newNum*10+digit;
                num1=num1/10;
            }
            return newNum;
        }
    }

