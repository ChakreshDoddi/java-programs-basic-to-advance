import java.util.Scanner;

class PrimeOrNot {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Welcome to prime number check\n");
        System.out.println("Please enter your number: ");
        int num=sc.nextInt();
        int c=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                c++;
                break;
                }
            }
        if(c==1){
            System.out.println("Given number is not prime");
        }
        else{
            System.out.println("Your number is prime");
        }
    }
}
