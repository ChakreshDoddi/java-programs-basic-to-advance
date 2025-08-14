import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Greatest Number Calculator:\n\n");
        System.out.println("Please enter any 3 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("Greatest among three numbers is "+a);
        }
        else if(b>=c){
            System.out.println("Greatest among three numbers is "+b);
        }
        else{
            System.out.println("Greatest among three numbers is "+c);
        }

    }
}
