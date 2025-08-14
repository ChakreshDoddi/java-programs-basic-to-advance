import java.util.Scanner;

class OddOrEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding even or odd\n");
        System.out.print("Please enter your number: ");
        int num=input.nextInt();
        OddOrEvenTernary ternary= new OddOrEvenTernary();
        if(ternary.OddOrEven(num)){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("Your number is odd");
        }

    }
    public boolean OddOrEven(int num){
       return num%2==0;
    }
}
