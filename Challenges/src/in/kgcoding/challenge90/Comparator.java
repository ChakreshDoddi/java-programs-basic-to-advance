package in.kgcoding.challenge90;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Bear");
        str.add("Zebra");
        str.add("Lion");
        str.add("Apple");
        str.add("Ant");
        System.out.println(str);
        sortInDescending(str);
        System.out.println(str);
    }
    public static void sortInDescending(List<String>str){
        Collections.sort(str,new java.util.Comparator<String>(){
            public int compare(String s, String t1){
                if(s.equals(t1)){
                    return 0;
                }
                else if(s.charAt(0)<t1.charAt(0)){
                    return 1;
                }
                else{
                   return -1;
                }
            }
        });
    }
}
