class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int i=0;
        int max=0;
        int min=arr[0];
        while(i<arr.length){
            if(arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        i=0;
        while(i<arr.length){
            if(arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        System.out.println("Maximum element in this Array is "+max);
        System.out.println("Minimum element in this Array is "+min);
    }
}
