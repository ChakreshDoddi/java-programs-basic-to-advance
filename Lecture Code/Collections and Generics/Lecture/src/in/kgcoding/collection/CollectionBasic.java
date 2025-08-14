package in.kgcoding.collection;

import java.util.*;

public class CollectionBasic {
    public static void main(String[] args) {
        Collection<String> str=new ArrayList<>();
        str.add("Hii");
        str.add("Chakre");
        str.remove("Hii");
        System.out.println(str);
        List<Integer> arr= new LinkedList<>();
        arr.add(5);arr.add(6);arr.add(1);arr.add(9);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
