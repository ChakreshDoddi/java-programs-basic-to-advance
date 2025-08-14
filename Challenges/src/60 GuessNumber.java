import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to number guessing game");
        int myNum=43;
        int yourNum;
        do{
            System.out.println("Please enter your number: (1 -100) ");
            yourNum=sc.nextInt();
        }while(myNum!=yourNum);
        System.out.println("Yes, hurray you guessed the number in my mind that is "+yourNum);
    }
}
