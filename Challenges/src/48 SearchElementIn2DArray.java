import java.util.Scanner;

 class SearchElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr=ArrayUtility.input2DArray();
        System.out.println("Enter element to search in an Array: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isFound=searchInArray(arr,num);
        if(isFound){
            System.out.println("Element is Found");
        }
        else{
            System.out.println("Element not found in 2d Array");
        }
    }
    public static boolean searchInArray(int[][] arr,int num){
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                if(arr[i][j]==num)
                    return  true;
                j++;
            }
i++;
        }
        return false;
    }
}
