import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator:\n\n ");
        System.out.println("Start entering your marks: ");
        System.out.print("Please enter your math marks: ");
        float math=sc.nextFloat();
        System.out.print("Please enter your science marks: ");
        float science=sc.nextFloat();
        System.out.print("Please enter your social marks: ");
        float social=sc.nextFloat();
        System.out.println("Please enter total marks: ");
        float totalMarks=sc.nextFloat();
         float percentage= ((math+science+social)/totalMarks)*100;
        if(percentage>=90){
            System.out.println("Your grade is A");
        }
        else if(percentage>=75){
            System.out.println("Your grade is B");
        }
       else if(percentage>=60){
            System.out.println("Your grade is C");
        }
       else if(percentage>=30){
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("Your grade is E");
        }
    }
}
