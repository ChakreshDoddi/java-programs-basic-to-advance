package in.kgcoding.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBasics {
    public static void main(String[] args) {
        Set <String> hs=new HashSet<>();
        hs.add("mass");
        hs.add("ra");
        hs.add("Chakri");
        hs.add("mass");
        System.out.println(hs);
        Set<String> lhs=new LinkedHashSet<>();
        lhs.add("Ra");
        lhs.add("Mass");
        lhs.add("Telugu");
        lhs.add("Vere");
        System.out.println(lhs);
        Set<Integer>ts=new TreeSet<>();
        ts.add(1);
        ts.add(9);
        ts.add(5);
        ts.add(11);
        System.out.println(ts);
        ts.remove(5);
        System.out.println(ts);
        System.out.println(ts.contains(9));
        System.out.println(ts.isEmpty());
    }
}
