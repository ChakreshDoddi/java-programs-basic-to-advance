package in.kgcoding.filterandreduce;

import java.util.List;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits=List.of("apple", "banana", "peaches", "grapes", "cherry");
        System.out.println(fruits.size());
        System.out.println("Printing fruits normally");
        for(String s: fruits){

            System.out.println(s);
        }
        System.out.println("Printing fruits using streams");
//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        fruits.stream().filter(fruit->fruit.endsWith("a")).forEach(fruit-> System.out.println(fruit));
    }
}
