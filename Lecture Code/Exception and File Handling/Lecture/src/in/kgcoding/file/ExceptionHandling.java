package in.kgcoding.file;

public class ExceptionHandling {
    public static void main(String[] args) {
//        int a=5;
//        int b=0;
//        int[]arr={1,2,3};
//        try{
//            int c=a/b;
//        }catch(ArithmeticException e){
//            System.out.println("Arithmetic Exception\n"+e.toString());
//        }
//        try{
//            String s=null;
//            System.out.println(s.length());
//        }catch (NullPointerException e){
//            System.out.println("Null Exception\n"+e.getMessage());
//        }
//        try{
//            System.out.println(arr[5]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.toString());
//        }
        try {
//            int a = 10 / 0;
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e.getClass().getSimpleName());
        }finally {
            System.out.println("this is the finally block");
        }
        System.out.println("Programs ends");
    }
}
