import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class FrequencyCounter {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9,1,3,5,6,7,7,7,7,7,7,7,8,456,77,567,587,687,68733,3545);
        System.out.println(Collections.frequency(arr,7));
        System.out.println(Collections.frequency(arr,6));
        System.out.println(Collections.frequency(arr,11));
    }
}
