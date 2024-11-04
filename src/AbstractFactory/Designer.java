package AbstractFactory;

public class Designer implements Employee{
    @Override
    public int getSalary() {
        return 100000;
    }

    @Override
    public String getDomain() {
        System.out.println("I am a DESIGNER");
        return "DESIGNER";
    }
}
