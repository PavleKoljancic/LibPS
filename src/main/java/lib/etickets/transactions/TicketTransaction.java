package lib.etickets.transactions;

import java.time.LocalDate;


//@JsonTypeName("ticketTr")
public class TicketTransaction extends Transaction{
    String supervisorId = null;

    public TicketTransaction(String userId, double amount, LocalDate date) {
        super(userId, amount, date);
    }

    public TicketTransaction() {
    }
    
}
