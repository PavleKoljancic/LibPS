package lib.etickets.ticket.amount;

import java.util.List;

import lib.etickets.ticket.Ticket;
import lib.etickets.transporter.Transporter;



public class AmountTicket extends Ticket{
    int amountOfUsage;

    public AmountTicket(String name, int ticketId, boolean needsDocumentation, List<Transporter> transporters,
            double price, int amountOfUsage) {
        super(name, ticketId, needsDocumentation, transporters, price);
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
