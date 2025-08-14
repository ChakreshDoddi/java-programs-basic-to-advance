package in.kgcoding.wrapper;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.valueOf;

public class WrapperClass {
    public static void main(String[] args) {
      Integer obj=10;
      int j=obj; //unboxing
        int i=10;
        Integer obj2=i;//autoBoxing
        //1. compareTo()
        Integer a=10, b=50;
        int cmp=a.compareTo(b);
        if(cmp < 0){
            System.out.println("a<b");
        } else if (cmp==0) {
            System.out.println("a==b");
        }
        else{
            System.out.println("a>b");
        }
//valueOf vs parseInt()
        String s="123";
        Integer value= valueOf(s);
        int prim=Integer.parseInt(s);
        System.out.println(value +" & "+ prim);
//toString()
         Integer str2=4567;
        String str=str2.toString();
        System.out.println(str);
//intValue()
Integer someInteger=42;
int prim2=someInteger.intValue();
double prim3=someInteger.doubleValue();
        System.out.println(prim3+" & "+prim2);
//int_max & int_min
        System.out.println("Int max: "+Integer.MAX_VALUE);
        System.out.println("Int min: "+Integer.MIN_VALUE);
        Integer x1 = new Integer(100);
        Integer x2 = new Integer(100);
        System.out.println(x1==x2);
        System.out.println(x1.equals(x2));
        Map<Integer, String> map = new HashMap<>();
        map.put(x1, "one hundred");
        System.out.println(map.get(x2));
    }
}
