package by.gsu.pms.repository;

import by.gsu.pms.entities.Passenger;
import by.gsu.pms.entities.Ticket;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerRepository {
    public PassengerRepository() {
    }

    public List<Passenger> getAllPassenger() throws SQLException {
        Connection connection = DataSource.getInstance().getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM tickets");
        List<Passenger> passengers = new ArrayList<>();
        while (result.next()) {
            Passenger passenger = new Passenger(result.getInt("id_passenger"), result.getString("name"), result.getString("pasport_data"));
            passengers.add(passenger);
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
        return passengers;
    }

    public void addPassenger(String name, String pasportData) throws SQLException {
        Connection connection = DataSource.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO passengers(name,pasport_data) VALUES (?,?)");
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, pasportData);
        preparedStatement.executeUpdate();
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public int findId(String name) throws SQLException {
        Connection connection = DataSource.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_passenger FROM passengers WHERE name=?");
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        int id = 0;
        if (resultSet.next()){
             id = resultSet.getInt("id_passenger");
        }
        return id;
    }
}
