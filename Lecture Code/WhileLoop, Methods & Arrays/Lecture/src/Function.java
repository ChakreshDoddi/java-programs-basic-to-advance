public class Function {
    public static void main(String[] args) {
//        System.out.println("Main method");
//        greeting();
//        System.out.println("Method calling complete");
//    }

 rightPyramid();
// reversePyramid();
// leftPyramid();




    }
    public static void rightPyramid(){
        int rows=0;
        while(rows<20){
            int i=0;
            while(i<=rows){
            System.out.print("* ");
            i++;}
            rows++;
            System.out.println();
        }
    }
    public static void reversePyramid(){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void leftPyramid(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

    public static void  greeting(){
        System.out.println("Good Morning from KGCoding");
    }
}
