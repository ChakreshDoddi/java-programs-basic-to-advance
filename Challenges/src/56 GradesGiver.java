import java.util.Scanner;

class GradesGiver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your marks from (0 to 100)");
        int n=sc.nextInt();
        String res=n>80?"High":(n>50?"Moderate":"low");
        System.out.println("Student grade is "+res);
    }
}
