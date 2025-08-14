import java.util.Scanner;

class PalinByRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker: \n\n");
        System.out.println("Please enter your input: ");
        String str=sc.nextLine();
        String res=isPalindrome(str)?"Palindrome":"Not Palindrome";
        System.out.println(res);
    }
    public static boolean isPalindrome(String str){
        if(str.length()==1){
        return true;}
        int lastPos=str.length()-1;
        if(str.charAt(0)!=str.charAt(lastPos)){
            return false;
        }
        String newStr=str.substring(1,lastPos);
        return  isPalindrome(newStr);
    }
}
