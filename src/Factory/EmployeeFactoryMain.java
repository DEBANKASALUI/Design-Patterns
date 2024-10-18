package Factory;

public class EmployeeFactoryMain {

    public static void main(String[] args) {
        Employee employee1= EmployeeFactory.getEmployee("Android DEVELOPER");
        System.out.println("Android Developer salary is: "+employee1.getSalary());
        Employee employee2= EmployeeFactory.getEmployee("Web DEVELOPER");
        System.out.println("Web Developer salary is: "+employee2.getSalary());
    }
}
