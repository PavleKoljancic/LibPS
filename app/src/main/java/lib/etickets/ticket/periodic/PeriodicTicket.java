package lib.etickets.ticket.periodic;

import java.util.Date;
import java.util.List;

import lib.etickets.ticket.Ticket;
import lib.etickets.transporter.Transporter;


public class PeriodicTicket extends Ticket{
    Date startDate;
    Date endDate;
    
    public PeriodicTicket(String name, int ticketId, boolean needsDocumentation, List<Transporter> transporters,
            double price, Date startDate, Date endDate) {
        super(name, ticketId, needsDocumentation, transporters, price);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public PeriodicTicket() {
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
