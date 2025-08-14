class ReverseArray {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
      reverse(arr);
        System.out.println("The reversed array is: ");
        int i=0;
        while(i<arr.length){
        System.out.println(arr[i]);
        i++; }
    }
    public static void reverse(int[] arr){
       int i=0;
       while(i< arr.length/2){
           int swap=arr[i];
           arr[i]=arr[arr.length-1-i];
           arr[arr.length-1-i]=swap;
           i++;
       }
    }
}

