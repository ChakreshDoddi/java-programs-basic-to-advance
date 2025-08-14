package chatgpt.dsa.arrays;

import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        //Traversal and Print
        int j=0;
        while(j< arr.length){
            arr[j]=sc.nextInt();
            j++;
        }
        arr[4]=85;
        for(int x:arr){
            System.out.print(x+" ");
        }
        int key =sc.nextInt();
        int i=find(arr,key);
        if(i==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.printf("Element %d found at %d index position ",key,i);
        }

        reverse(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
//    Linear Search
    public static int find(int[]arr,int key){
        for (int i = 0; i < arr.length;i++) {
            if(arr[i]==key){
                return i;
            }

        }
        return -1;
    }
    //reverse an array;
    public static  void reverse(int[]arr){
        for(int i=0;i<arr.length/2;i++){
            int last= arr.length-i-1;
            int temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
        }
    }
}
