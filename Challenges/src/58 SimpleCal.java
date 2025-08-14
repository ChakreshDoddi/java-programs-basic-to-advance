import java.util.Scanner;

class SimpleCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        String a=sc.next();
        int res = switch (a) {
            case "+"->num1+num2;
            case "*"->num1*num2;
            case "/"->num1/num2;
            case "-"->num1-num2;
            default -> -1;
        };
        System.out.println("Your answer is: " + res);
    }
}
