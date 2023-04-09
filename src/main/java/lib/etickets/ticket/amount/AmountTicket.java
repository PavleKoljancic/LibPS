package lib.etickets.ticket.amount;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lib.etickets.ticket.Ticket;
import lib.etickets.transporter.Transporter;


@JsonTypeName("amount")
public class AmountTicket extends Ticket{
    int amountOfUsage;

    public AmountTicket(String name, String ticketId, boolean needsDocumentation, List<Transporter> transporters,
            double price, String ticketType, int amountOfUsage) {
        super(name, ticketId, needsDocumentation, transporters, price, ticketType);
        this.amountOfUsage = amountOfUsage;
    }

    public AmountTicket() {
    }

    public int getAmountOfUsage() {
        return amountOfUsage;
    }

    public void setAmountOfUsage(int amountOfUsage) {
        this.amountOfUsage = amountOfUsage;
    }
    
}
