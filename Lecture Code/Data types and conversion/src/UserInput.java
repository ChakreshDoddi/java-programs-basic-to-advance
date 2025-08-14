import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name= input.nextLine();
        System.out.println("Welcome to Java coding "+name);
        System.out.print("Also tell me your experience in years: ");
        int age= input.nextInt();
        System.out.println("So your experience is "+ age + " years" );
    }
}
