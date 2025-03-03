package data;

import lombok.Data;

import java.util.Objects;
@Data

public class Ticket implements Comparable<Ticket> {

    private int id;
    private int cost;
    private String fromAirport;
    private String toAirport;
    private int timeInFlight;

    public Ticket(int id, int cost, String fromAirport, String toAirport, int timeInFlight) {
        this.id = id;
        this.cost = cost;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.timeInFlight = timeInFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && cost == ticket.cost && timeInFlight == ticket.timeInFlight && Objects.equals(fromAirport, ticket.fromAirport) && Objects.equals(toAirport, ticket.toAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cost, fromAirport, toAirport, timeInFlight);
    }


    @Override
    public int compareTo(Ticket priceTicket) {
        if (cost < priceTicket.cost) {
            return -1;
        }
        if (cost > priceTicket.cost) {
            return 1;
        }
        return 0;
    }
}
