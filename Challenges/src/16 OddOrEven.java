import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        System.out.print("Please enter any number: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.print("Given number is even");
        }
        else{
            System.out.print("GIven number is odd");
        }
    }
}
