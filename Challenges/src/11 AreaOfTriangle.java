import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter breadth of the triangle: ");
        int bre=sc.nextInt();
        System.out.print("Please enter height of the triangle: ");
        int hei =sc.nextInt();
        System.out.println((int)(0.5*(bre *hei)));
    }
}
