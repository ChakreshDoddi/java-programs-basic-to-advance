import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length of an array: ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("Please enter all the array elements: ");
        int i=0;
        while(i<length){
            arr[i]=sc.nextInt();
            i++;
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        int i=0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
    public static int[][] input2DArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter no. of rows in array: ");
        int rows=sc.nextInt();
        System.out.println("Please enter no. of columns in array: ");
        int columns=sc.nextInt();
        int[][] arr=new int[rows][columns];
        System.out.println("Please enter all the array elements: ");
        int i=0;

        while(i<rows){
            int j=0;
           while(j<columns){
               arr[i][j]=sc.nextInt();
               j++;
           }
           i++;
        }
        return arr;
        }
    }

