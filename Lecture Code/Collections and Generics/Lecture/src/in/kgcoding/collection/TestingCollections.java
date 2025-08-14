package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numlist=new ArrayList<>();
        numlist.add(-24);
        numlist.add(10);
        numlist.add(4);
        numlist.add(3);
        for(Integer i:numlist){
            System.out.print(i+" ");
        }
        System.out.println();
        Collections.sort(numlist);
        for(Integer i:numlist){
            System.out.print(i+" ");
        }
        System.out.println();
        int index=Collections.binarySearch(numlist, 3);
        System.out.println(index);
        Collections.reverse(numlist);
        for(Integer i:numlist){
            System.out.print(i+" ");
        }
        System.out.println();

//         List<Integer> unmodifiable=Collections.unmodifiableList(numlist);
//         unmodifiable.add(4);
    }
}
