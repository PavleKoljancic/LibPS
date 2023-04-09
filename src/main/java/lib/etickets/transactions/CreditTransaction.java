package lib.etickets.transactions;

import java.time.LocalDate;

//@JsonTypeName("creditTr")
public class CreditTransaction extends Transaction{
    String supervisorId;

    public CreditTransaction() {
    }

    public CreditTransaction(String userId, double amount, LocalDate date, String supervisorId) {
        super(userId, amount, date);
        this.supervisorId = supervisorId;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }
}
