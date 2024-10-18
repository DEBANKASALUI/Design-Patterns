package Factory;

public class AndriodDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Getting Android Developer Salary");
        return 50000;
    }
}
