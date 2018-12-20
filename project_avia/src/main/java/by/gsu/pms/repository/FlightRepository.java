package by.gsu.pms.repository;

import by.gsu.pms.entities.Flight;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public FlightRepository() {
    }

    public List<Flight> getAllFlights() throws SQLException {
        Connection connection = DataSource.getInstance().getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM flights");
        List<Flight> flights = new ArrayList<>();
        while (result.next()) {
            Flight flight = new Flight(result.getInt("id_flight"), result.getString("departure_city"), result.getString("city_of_arrival"));
            flights.add(flight);
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
        return flights;
    }

    public void addFlight(String departureCity, String cityOfArrival) throws SQLException {
        Connection connection = DataSource.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO flights(departure_city,city_of_arrival) VALUES (?,?)");
        preparedStatement.setString(1, departureCity);
        preparedStatement.setString(2, cityOfArrival);
        preparedStatement.executeUpdate();
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

}
