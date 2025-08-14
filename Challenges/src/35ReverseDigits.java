import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Reverse Digits Program:  ");
        System.out.println("Please enter a number to reverse it: ");
        int num=sc.nextInt();
        int reverse=reverse(num);
        System.out.println("Reverse of given number is: "+reverse
        );
    }
    public static int reverse(int num1){
        int newNum=0;
        while(num1>0){
            int digit=num1%10;
            newNum=newNum*10+digit;
            num1=num1/10;
        }
        return newNum;
    }
}
