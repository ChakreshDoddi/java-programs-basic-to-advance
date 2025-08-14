package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List <String> strList=new ArrayList<>();
        strList.add("Prashanth");
        strList.add("Jain");
//        strList.add(54);
        strList.add(1,"Pradeep");
        strList.removeFirst();
        for(String s:strList){
            System.out.print(s);
        }
    }
}
