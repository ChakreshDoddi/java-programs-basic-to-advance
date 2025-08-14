import java.util.Scanner;

class MultiplicationTableFor {
    public static void main(String[] args) {
        System.out.println("Welcome to Mutliplication table printer upto 10 multiples\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
