package in.kgcoding.customexceptions;

public class AgeTester {
    public static void main(String[] args) {
        try {
            AgeChecker.checkAge(85);
        }catch (AgeException e){
            System.out.println(e.getMessage());
            System.out.println("Invalid age: "+e.getAge());
        }

    }
}
