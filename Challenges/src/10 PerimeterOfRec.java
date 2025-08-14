import java.util.Scanner;

class PerimeterOfRec {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.print("Please enter length of the rectangle: ");
         int len=sc.nextInt();
         System.out.print("Please enter breadth of the rectangle: ");
         int bre=sc.nextInt();
         System.out.println(2*(len+bre));
     }
}
