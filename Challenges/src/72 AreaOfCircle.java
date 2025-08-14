import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Welcome to area and circumference calculator of circle: ");
        System.out.println("Please enter the circle radius: ");
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        AreaAndCircum(radius);
    }
    static void AreaAndCircum(float radius){
        System.out.printf("Area of circle is %f\n",Math.PI*radius*radius);
        System.out.println("Circumference of circle is: "+Math.PI*2*radius);
    }
}
