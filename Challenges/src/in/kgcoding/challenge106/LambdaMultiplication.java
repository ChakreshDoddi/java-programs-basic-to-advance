package in.kgcoding.challenge106;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> mutli=(a,b)->a*b;
        int result=mutli.apply(5,6);
        System.out.println(result);
    }
}
