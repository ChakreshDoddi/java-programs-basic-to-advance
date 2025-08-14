public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] arr=ArrayUtility.input2DArray();
        long sum=sumOfDiagonals(arr);
        System.out.println("Sum of Diagonals in given array is: "+sum);
    }
public static long sumOfDiagonals(int[][]arr){
        long sum=0;
        if(arr.length%2!=0){
            int i=arr.length/2;
            sum=sumOfLeftDiagonal(arr)+sumOfRightDiagonal(arr)-arr[i][i];
            return sum;
        }

        return sumOfRightDiagonal(arr)+sumOfLeftDiagonal(arr);
}
    public static long sumOfRightDiagonal(int[][]arr){
        int i=0;
        long sum=0;
        while(i< arr.length){
            sum+=arr[i][i];
            i++;
        }
return sum;
    }
    public static long sumOfLeftDiagonal(int[][]arr){
        int i=0;
        long sum=0;
        while(i<arr.length){
            int column= arr.length-1-i;
            sum+=arr[i][column];
            i++;
        }
        return sum;
    }
}
