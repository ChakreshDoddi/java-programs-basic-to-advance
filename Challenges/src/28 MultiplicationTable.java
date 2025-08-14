import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int num=sc.nextInt();
        System.out.println("Printing Multiplication table of given number: ");
        for(int i=1;i<=10;i++){
            System.out.println(num+ " * "+i+" = "+(num*i));
        }
    }
}
