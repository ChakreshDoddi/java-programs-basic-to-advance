import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Factorial Calculator: ");
        System.out.println("Please enter any number: ");
        int num=sc.nextInt();
        long factorial=1;
        int i=1;
        while(i<=num){
            factorial*=i;
            i++;
        }
        System.out.println(factorial);
    }
}
