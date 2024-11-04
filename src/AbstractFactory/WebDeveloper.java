package AbstractFactory;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public String getDomain() {
        System.out.println("I am a WEB DEVELOPER");
        return "WEB DEVELOPER";
    }
}
