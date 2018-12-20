package by.gsu.pms.repository;

import by.gsu.pms.entities.Ticket;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    public TicketRepository() {
    }

    public List<Ticket> getAllTickets() throws SQLException {
        Connection connection = DataSource.getInstance().getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM tickets");
        List<Ticket> tickets = new ArrayList<>();
        while (result.next()) {
            Ticket ticket = new Ticket(result.getInt("id_tickets"), result.getDouble("cost"), result.getDate("date"), result.getInt("id_flight"), result.getInt("id_passenger"));
            tickets.add(ticket);
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
        return tickets;
    }

    public void addTicket(double cost, Date date, String name, int flightId) throws SQLException {
        PassengerRepository passengerRepository = new PassengerRepository();
        int passengerId = passengerRepository.findId(name);
        Connection connection = DataSource.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tickets(cost,date,id_flight,id_passenger)VALUES (?,?,?,?)");
        preparedStatement.setDouble(1, cost);
        preparedStatement.setDate(2, date);
        preparedStatement.setInt(3, passengerId);
        preparedStatement.setInt(4, flightId);
        preparedStatement.executeUpdate();
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }


    }
}
