package AbstractFactory;

public class Client {
    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
//        System.out.println(e1.getSalary()+" , "+e1.getDomain());
//        System.out.println(e1.hashCode());
        e1.getDomain();

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
//        System.out.println(e2.getSalary()+" , "+e2.getDomain());
//        System.out.println(e2.hashCode());
        e2.getDomain();

        Employee e3=EmployeeFactory.getEmployee(new DesignerFactory());
        e3.getDomain();
    }
}
