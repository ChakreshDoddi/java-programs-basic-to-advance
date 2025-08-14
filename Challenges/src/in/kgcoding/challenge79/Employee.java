package in.kgcoding.challenge79;

public class Employee {
    private String employeeName;
    private int age;
    private int salary;

    public Employee(String employeeName, int age, int salary) {
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

     String displayEmployeeDetails() {
        return "EmployeeDetails: " +
                "Name='" + employeeName + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }
}
