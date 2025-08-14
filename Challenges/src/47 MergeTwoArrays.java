class MergeTwoArrays {
    public static void main(String[] args) {
        System.out.println("Array 1: ");
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println("Array 2: ");
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArray=mergeArray(arr1,arr2);
        ArrayUtility.displayArray(mergedArray);
    }
    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[]  arr3= new int[arr1.length+ arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length || j< arr2.length){
            if(j==arr2.length ||((i<arr1.length)&& (arr1[i]<arr2[j]))){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        return arr3;
    }

}
