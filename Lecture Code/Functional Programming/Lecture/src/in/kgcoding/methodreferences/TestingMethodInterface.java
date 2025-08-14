package in.kgcoding.methodreferences;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer>numbers=List.of(2,2,3,4,5,6,7,9);
        numbers.stream().filter(num->num%2==1).forEach(num->System.out.println(num));
    }
}
