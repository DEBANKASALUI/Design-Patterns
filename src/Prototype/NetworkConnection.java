package Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String impData;
    private List<String> domain = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", impData='" + impData + '\'' +
                ", domain=" + domain +
                '}';
    }

    public void loadImpData() throws InterruptedException {
        this.impData = "Very important Data";
        domain.add("www.github.com");
        domain.add("www.linkedin.com");
        domain.add("www.naukri.com");
        domain.add("www.leetcode.com");
        domain.add("www.google.com");
        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//      Logic for cloning: for DEEP copy
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImpData(this.getImpData());
        for (String d : this.getDomain()) {
            networkConnection.getDomain().add(d);
        }
        return networkConnection;
//       Logic for cloning: Shallow Copy
//        return super.clone();
    }
}
