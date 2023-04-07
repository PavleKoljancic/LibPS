package lib.etickets.transactions;

import java.util.Date;


/*@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({@JsonSubTypes.Type(value = CreditTransaction.class, name = "creditTr"),
        @JsonSubTypes.Type(value = TicketTransaction.class, name = "ticketTr")})*/
public abstract class Transaction {
    String userId;
    double amount;
    Date date;

    public Transaction() {
    }
    
    public Transaction(String userId, double amount, Date date) {
        this.userId = userId;
        this.amount = amount;
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
