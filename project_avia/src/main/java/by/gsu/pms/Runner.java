package by.gsu.pms;

import by.gsu.pms.entities.Flight;
import by.gsu.pms.entities.Passenger;
import by.gsu.pms.entities.Ticket;
import by.gsu.pms.repository.FlightRepository;
import by.gsu.pms.repository.PassengerRepository;
import by.gsu.pms.repository.TicketRepository;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class Runner {
    private FlightRepository flightRepository;
    private TicketRepository ticketRepository;
    private PassengerRepository passengerRepository;

    private Runner() {
        this.flightRepository = new FlightRepository();
        this.ticketRepository = new TicketRepository();
        this.passengerRepository = new PassengerRepository();
    }

    private void demo() throws SQLException {
        //flightRepository.addFlight("Kiev","Gomel");
        List<Flight> flights = flightRepository.getAllFlights();
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        //passengerRepository.addPassenger("Dima Lown","HB1478596");
        List<Passenger> passengers = passengerRepository.getAllPassenger();
        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }
        //ticketRepository.addTicket(15.3, Date.valueOf("2018-12-12"), "Scot Molly", 5);
        List<Ticket> tickets = ticketRepository.getAllTickets();
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public static void main(String[] args) throws SQLException {
        new Runner().demo();
    }

}
