import java.util.Scanner;

class SumAndAverageOfArrayElements {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        double sum=0;
        int i=0;
        while(i< arr.length){
            sum+=arr[i];
            i++;
        }
        System.out.println("Sum of all elements in array is: "+sum);
        System.out.println("Average of elements in given array is : "+(double)(sum/ arr.length));

    }
}
