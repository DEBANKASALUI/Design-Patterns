package Factory;

public class EmployeeFactory {
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("Android Developer")){
            return new AndriodDeveloper();
        }else if(empType.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }else{
            return null;
        }
    }
}
