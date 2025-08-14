import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name");
        String Name=sc.nextLine();
        System.out.print("Welcome "+Name+" to KG Coding");
    }
}
