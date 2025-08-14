import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseElements {
    public static void main(String[] args) {
        List<Integer>arr= Arrays.asList(1,2,3,4,5,6,7,6,8,9);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
