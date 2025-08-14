package in.kgcoding.customexceptions;

public class AgeException extends Exception{
    private int age;
    AgeException(int age){
        this.age=age;
    }
    public String getMessage(){
        return "Your age is " +age+", which is not valid for voting";
    }
    public int getAge(){
        return this.age;
    }
}
