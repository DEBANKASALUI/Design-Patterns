package Prototype;

public class ClientPrototype {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("Creating object using Prototype Design Pattern");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("198.242.4.8");
        networkConnection.loadImpData();
        System.out.println(networkConnection);

//      cloning object2 & object3
        NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
        NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();

        networkConnection.getDomain().remove(0);
        System.out.println(networkConnection);
        System.out.println(networkConnection1);
        System.out.println(networkConnection2);
    }

}

