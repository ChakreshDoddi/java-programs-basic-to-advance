package in.kgcoding.customexceptions;

public class GradeException extends Exception {
    private String grade;
GradeException(String grade){
    this.grade=grade;
}
public String getMessage(){
    return "Your grade is "+grade+" which is invalid, please enter right grade";
}
    public String getGrade() {
        return grade;
    }
}
