import java.util.Scanner;

class MonthBySwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any number from 1 to 12: ");
        int num=sc.nextInt();
        String month=switch(num){
            case 1->"January";
            case 2->"February";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"September";
            case 10->"October";
            case 11->"November";
            case 12->"December";
            default -> "Invalid not in range (1-12)";
        };
        System.out.println("Your month is "+month);
    }
}
