import java.util.Scanner;

class CheckPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Check Prime Number: ");
        System.out.println("Please enter your number: ");
        int num=sc.nextInt();
        int i=1;
        int c=0;
        while(i<=Math.sqrt(num)){
            if(num%i==0){
                c++;
            }
            i++;
        }
        if(c==1){
            System.out.println("Given number is prime");
        }
        else{
            System.out.println("Given number is not prime");
        }
    }
}
