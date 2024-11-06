package Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern");

//      using Iphone charger
//      AppleCharger charger=new ChargerXYZ();

//      using adapter to charge Iphone with Android charger
        AndroidCharger androidCharger=new DKCharger();
        AppleCharger charger=new AdapterCharger(androidCharger);

        Iphone iphone1=new Iphone(charger);
        iphone1.chargeIPhone();
    }
}
