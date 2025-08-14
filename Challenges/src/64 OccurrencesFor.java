import java.util.Scanner;

class OccurrencesFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to occurrences of a specific element calculator: \n");
        int[] arr=ArrayUtility.inputArray();
        System.out.println("Please enter your number, to check it occurrence: ");
        int n=sc.nextInt();
        int c=0;
        for(int num:arr){
            if(n==num){
                c++;
            }
        }
        System.out.println("Your number is occured "+c+" times");
    }
}
