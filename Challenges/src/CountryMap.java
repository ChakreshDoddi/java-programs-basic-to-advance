import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("USA","Washington DC");
        map.put("India","New Delhi");
        map.put("China","Beijing");
        map.put("Japan","Tokyo");
        map.put("Pakistan", "Islamabad");
        System.out.println("Please enter a country name");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(map.containsKey(s)){
            System.out.printf("Capital of %s is %s",s,map.get(s));
        }
        else{
            System.out.println("Your country is not in the map");
        }
    }
}
