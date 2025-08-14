public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("before loop");
        for(int i=1;i<=100;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("after loop");
    }
}
