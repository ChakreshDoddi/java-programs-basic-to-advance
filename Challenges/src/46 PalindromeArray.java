class PalindromeArray {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
      boolean isPalin =  palindrome(arr);
      if(isPalin){
          System.out.println("Given Array is palindrome");
      }
      else{
          System.out.println("Given Array is not palindrome");
      }
    }
    public static boolean palindrome(int[] arr){
        int i=0;
        while(i<arr.length/2){
            if(arr[i]!=arr[arr.length-1-i]){
               return false;
            }
            i++;
        }
        return true;
    }
}
