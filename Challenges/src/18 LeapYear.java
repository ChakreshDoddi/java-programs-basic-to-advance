import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year Calculator: \n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year=sc.nextInt();
        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println("Given year is leap Year");
        }
        else{
            System.out.println("Given year is not a leap year");
        }
    }
}
