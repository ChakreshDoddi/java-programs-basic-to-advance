package in.kgcoding.customexceptions;

import java.util.Objects;

public class GradeChecker {
    public static void checkGrade(String grade) throws GradeException{
        if (grade.equals("A") && grade.equals("B")) {
            System.out.println("Your result is Pass");
        } else {
            throw new GradeException(grade);
        }
    }

    public static void main(String[] args) {
        try{
            GradeChecker.checkGrade("A");
        }catch(GradeException e){
            System.out.println(e.getMessage());
            System.out.println("Invalid grade: "+e.getGrade());
        }
    }
}
