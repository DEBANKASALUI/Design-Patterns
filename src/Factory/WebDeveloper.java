package Factory;

public class WebDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Getting Web Developer Salary");
        return 40000;
    }
}
