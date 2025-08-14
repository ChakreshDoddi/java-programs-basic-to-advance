import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] myArr= {1,2,3,4,5,5,56,675,43,65,5653,35};
        System.out.println("Welcome to Array Searching\n");
        System.out.println("Enter the number you want to search: ");
        int num=sc.nextInt();
       boolean isFound=isFound(myArr,num);
       if(isFound){
           System.out.println("Found given number in Array");
       }
       else{
           System.out.println("Not Found");
       }
    }
    public static boolean isFound(int[] arr, int num ){
        int index=0;
        while(index< arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
