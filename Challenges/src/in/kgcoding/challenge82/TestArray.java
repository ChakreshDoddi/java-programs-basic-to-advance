package in.kgcoding.challenge82;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations arr=new ArrayOperations(new int[]{1,2,3,4});
        ArrayOperations.Statistics stat=arr.new Statistics();
        System.out.println(stat.mean());
    }
}
