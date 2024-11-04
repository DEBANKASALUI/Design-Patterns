package AbstractFactory;

public class DesignerFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Designer();
    }
}
