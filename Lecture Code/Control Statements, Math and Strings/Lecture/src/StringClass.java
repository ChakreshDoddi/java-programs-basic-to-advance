public class StringClass {
    public static void main(String[] args) {
        String s1="abc";
        s1="bcd";
        System.out.println(s1);

        String s2="abc";
        String s3=new String("abc");
        System.out.println(s2.equals(s3));


    }
}
