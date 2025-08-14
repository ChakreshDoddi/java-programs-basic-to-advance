 class StudentToString {
    String studentName;
    int studentAge;
    int studentClass;


    public StudentToString(String studentName, int studentAge, int studentClass) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student Details{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentClass=" + studentClass +
                '}';
    }

    public static void main(String[] args) {
        StudentToString stu=new StudentToString("Goutham",13,8);
        System.out.println(stu);

    }
}
