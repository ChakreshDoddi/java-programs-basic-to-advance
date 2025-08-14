class SumAndAverageIn2DArray {
    public static void main(String[] args) {
        int[][] arr=ArrayUtility.input2DArray();
        int sum=sumOfElementsIn2DArray(arr);
        double average=averageIn2DArray(arr);
        System.out.println("Sum of elements in you array are: "+sum);
        System.out.println("Average of elements in you array are: "+average);
    }
    public static int sumOfElementsIn2DArray(int[][]arr){
        int i=0;
        int sum=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                sum+=arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public  static double averageIn2DArray(int[][]arr){
        double count=arr.length*arr[0].length;
        return sumOfElementsIn2DArray(arr)/count;
    }
}
