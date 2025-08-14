import java.sql.SQLOutput;
import java.util.Scanner;

class ContinueSum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int i=10;
        int num;
        while(i>0){
            num=sc.nextInt();
            i--;
            if(num<0){
                continue;
            }
            sum+=num;

        }
        System.out.println("Your total sum is: "+sum);
    }
}
