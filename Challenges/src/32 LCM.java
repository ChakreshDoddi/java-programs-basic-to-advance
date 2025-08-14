import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator of Two numbers:\n ");
        System.out.println("Please enter any two numbers: ");
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        int i=1;
        int lcm=1;
        while(i!=0){
            if((num1*i)%num2==0){
                lcm=num1*i;
                i=-1;
            }
          i++;
        }
        System.out.println(lcm);
    }
}
