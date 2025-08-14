import java.util.Scanner;

class ArrayOfWords {
    public static void main(String[] args) {
        String[] arr=new String[5];
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your 5 words");
        while(i<arr.length){
            arr[i]=sc.nextLine();
            i++;
        }
        System.out.println(stringConcat(arr));
    }
    static StringBuilder stringConcat(String[]arr){
        StringBuilder sc=new StringBuilder();
        for (String s : arr) {
            sc.append(s).append(" ");
        }
        return sc;
    }
}
