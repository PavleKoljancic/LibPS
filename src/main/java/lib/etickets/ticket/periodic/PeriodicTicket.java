package lib.etickets.ticket.periodic;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lib.etickets.ticket.Ticket;
import lib.etickets.transporter.Transporter;

@JsonTypeName("periodic")
public class PeriodicTicket extends Ticket{

    LocalDate startDate = null;
    LocalDate endDate = null;
    public int durationInDays;

    public PeriodicTicket(String name, String ticketId, boolean needsDocumentation, List<Transporter> transporters,
            double price, String ticketType, int durationInDays, LocalDate startDate, LocalDate endDate) {
        super(name, ticketId, needsDocumentation, transporters, price, ticketType);
        this.durationInDays = durationInDays;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public PeriodicTicket() {
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }
}
