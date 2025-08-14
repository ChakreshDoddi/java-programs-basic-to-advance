import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 class SwapElements {
    public static void main(String[] args) {
        List<Integer>arr= Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(arr);
        Collections.swap(arr,8,2);
        System.out.println(arr);
    }
}
