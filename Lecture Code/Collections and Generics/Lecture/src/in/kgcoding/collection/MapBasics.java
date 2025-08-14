package in.kgcoding.collection;

import java.util.HashMap;
import java.util.Map;
public class MapBasics {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"How");
        map.put(3,"are");
        map.put(2, "you");
        map.put(5, "How");
        map.put(0,"Are");
        map.put(-1,"are");
        map.put(0,"How");
        map.put(-2,"Vysh");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
