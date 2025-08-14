package in.kgcoding.varargs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6,6,7,7,7,7,7,7));
    }
    public static int sum(int... a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
//    public static int sum(int[]arr){
//        int sum=0;
//        for(int i:arr){
//            sum+=i;
//        }
//        return sum;
//    }
    public static int sum(int a,int b){
        return a+b;
    }
}
