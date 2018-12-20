package by.gsu.pms.entities;

public class Passenger {
    private int passengerId;
    private String name;
    private String pasportData;

    public Passenger() {
    }

    public Passenger(int passengerId, String name, String pasportData) {
        this.passengerId = passengerId;
        this.name = name;
        this.pasportData = pasportData;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasportData() {
        return pasportData;
    }

    public void setPasportData(String pasportData) {
        this.pasportData = pasportData;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", name='" + name + '\'' +
                ", pasportData='" + pasportData + '\'' +
                '}';
    }
}
