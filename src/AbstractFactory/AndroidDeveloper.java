package AbstractFactory;

public class AndroidDeveloper implements Employee {

    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getDomain() {
        System.out.println("I am an Android Developer");
        return "ANDROID DEVELOPER";
    }
}
