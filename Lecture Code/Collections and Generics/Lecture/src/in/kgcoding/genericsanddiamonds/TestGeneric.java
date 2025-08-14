package in.kgcoding.genericsanddiamonds;

public class TestGeneric {
    public static void main(String[] args) {
        Box<Integer>strbox=new Box<>();
        strbox.setContent(2);
        System.out.println(strbox.getContent());
        Integer[] nums={1,4,5,6};
        strbox.printArray(nums);
    }
}
