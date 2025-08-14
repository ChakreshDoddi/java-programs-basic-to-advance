import java.util.Scanner;

class ArmstrongNUmber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Armstrong number check: ");
        System.out.println("Please enter your number");
        int num=sc.nextInt();
        if(checkArmstrong(num)==num){
            System.out.println("Given number is Armstrong");
        }
        else{
            System.out.println("Given number is not a Armstrong number");
        }

    }
public static double checkArmstrong(int num){
        double noOfDigits=numberOfDigits(num);
        double sum=0;
        while(num>0){
            double digit=num%10;
            sum+=Math.pow(digit,noOfDigits);
            num=num/10;
        }
     return sum;
}
    public static double numberOfDigits(int num) {

       double c=0;
       while(num>0){
            num=num/10;
            c++;
        }
 return c;
    }
}
