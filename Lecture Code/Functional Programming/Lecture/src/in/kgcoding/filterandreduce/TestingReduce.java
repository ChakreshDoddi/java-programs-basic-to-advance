package in.kgcoding.filterandreduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer>numbers=List.of(1,2,3,4,5,6,7);
     int newsum =   numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });
        System.out.println(newsum);
        int newsum2=numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(newsum2);
        int max=numbers.stream()
                .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println(max);
    }
}
