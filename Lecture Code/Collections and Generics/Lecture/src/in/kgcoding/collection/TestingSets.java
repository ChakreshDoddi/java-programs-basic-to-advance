package in.kgcoding.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSets {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Chakresh");
        set.add("is practicing java.");
        set.add("So, he can get a job");
        set.add("Also he using chatgpt");
        set.add("to learn java by himself");
        for(String s:set){
            System.out.print(s+"\n");
        }
        System.out.println(set.contains("Chakresh"));
        System.out.println(set.remove("Chakresh"));
    }
}
