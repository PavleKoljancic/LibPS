package lib.etickets.transactions;

import java.util.Date;


//@JsonTypeName("ticketTr")
public class TicketTransaction extends Transaction{
    String supervisorId = null;

    public TicketTransaction(String userId, double amount, Date date) {
        super(userId, amount, date);
    }

    public TicketTransaction() {
    }
    
}
