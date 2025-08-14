package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class ListBasic {
    public static void main(String[] args) {
//        List<Integer> nums=new ArrayList<>();
//        nums.add(1);
//        nums.add(2);
//        System.out.println(nums);
//        nums.add(0,5);
//        System.out.println(nums);
//        nums.set(0,3);
//        System.out.println(nums);
//        nums.remove(0);
//        System.out.println(nums);
//        System.out.println(nums.lastIndexOf(2));

        List<String> list = new ArrayList<>(Arrays.asList("ra","mass","telugu"));
        ListIterator<String> it = list.listIterator();

// Forward traverse
        while(it.hasNext()) {
            System.out.print(it.next() + " ");  // ra mass telugu
        }
        System.out.println();

// Backward traverse
        while(it.hasPrevious()) {
            System.out.print(it.previous() + " ");  // telugu mass ra
        }
        it.add("test");
        System.out.println(list);

// During iteration add / set / remove
        it = list.listIterator(1);     // index 1 nundi start
        it.next();                     // moves to "mass"
        it.set("FULL-MASS");           // replaces "mass" with "FULL-MASS"
        it.add("STYLE");
        it.add("Dance");// inserts "STYLE" before "telugu"
        System.out.println(list);      // [ra, FULL-MASS, STYLE, telugu]
    }
}
