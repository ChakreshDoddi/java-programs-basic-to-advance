import java.util.Scanner;

class BreakInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String keyword="exit";
        while(true){
            System.out.println("Please enter your input");
            String input=sc.nextLine();
            if(keyword.equals(input)){
                break;
            }
        }
        System.out.println("You have successfully exit");
    }
}
