package Adapter;

public class DKCharger implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your Android Phone is charging...");
    }
}
