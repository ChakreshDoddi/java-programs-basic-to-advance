import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your String : ");
        String str=sc.nextLine();
        Set<Character>ustr=new LinkedHashSet<>();
        int i=0;
        while(i<str.length()){
            ustr.add(str.charAt(i));
            i++;
        }
        System.out.println(ustr);
    }
}
