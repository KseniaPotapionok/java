package by.gsu.pms.entities;

import java.sql.Date;

public class Ticket {
    private int ticketId;
    private double cost;
    private Date date;
    private int fligtId;
    private int passengerId;

    public Ticket() {
    }

    public Ticket(int ticketId, double cost, Date date, int fligtId, int passengerId) {
        this.ticketId = ticketId;
        this.cost = cost;
        this.date = date;
        this.fligtId = fligtId;
        this.passengerId = passengerId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFligtId() {
        return fligtId;
    }

    public void setFligtId(int fligtId) {
        this.fligtId = fligtId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", cost=" + cost +
                ", date=" + date +
                ", fligtId=" + fligtId +
                ", passengerId=" + passengerId +
                '}';
    }
}
