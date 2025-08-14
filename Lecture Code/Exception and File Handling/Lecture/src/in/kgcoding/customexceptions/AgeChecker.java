package in.kgcoding.customexceptions;

public class AgeChecker {
    public static void checkAge(int age) throws AgeException{
        if(age<18 || age>75){
            throw new AgeException(age);
        }
        else{
            System.out.println("You are eligible for voting");
        }
    }
}
