package by.gsu.pms.entities;

public class Flight {
    private int flightId;
    private String departureCity;
    private String cityOfArrival;

    public Flight() {
    }

    public Flight(int flightId, String departureCity, String cityOfArrival) {
        this.flightId = flightId;
        this.departureCity = departureCity;
        this.cityOfArrival = cityOfArrival;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public void setCityOfArrival(String cityOfArrival) {
        this.cityOfArrival = cityOfArrival;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", departureCity='" + departureCity + '\'' +
                ", cityOfArrival='" + cityOfArrival + '\'' +
                '}';
    }
}
