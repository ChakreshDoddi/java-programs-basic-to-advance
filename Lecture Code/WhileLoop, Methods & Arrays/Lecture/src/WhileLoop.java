import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int a=5; // initialization
//        while(a<1000){ // condition
//            System.out.println(a); //actual work
//           a=a*5; // updating the condition
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
            int count=500;
            while(count>=200){
                System.out.println(count);
                count-=1;

        }
    }
}
