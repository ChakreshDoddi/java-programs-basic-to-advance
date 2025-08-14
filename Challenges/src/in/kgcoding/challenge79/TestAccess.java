package in.kgcoding.challenge79;

public class TestAccess {
    public static void main(String[] args) {
        Employee emp1=new Employee("Chakresh Doddi",25,50000);
        System.out.println(emp1.displayEmployeeDetails());
        emp1.setEmployeeName("Vyshu");
        System.out.println(emp1.displayEmployeeDetails());
    }
}
