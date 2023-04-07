package lib.etickets.ticket.response;

import java.util.Date;

import lib.etickets.ticket.Ticket;

public class TicketApprovalResponse {

    Date date;
    String comment;
    boolean approved;
    Ticket requestedTicket;
    String supervizorName;
    
    public TicketApprovalResponse(Date date, String comment, boolean approved, Ticket requestedTicket,
            String supervizorName) {
        this.date = date;
        this.comment = comment;
        this.approved = approved;
        this.requestedTicket = requestedTicket;
        this.supervizorName = supervizorName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Ticket getRequestedTicket() {
        return requestedTicket;
    }

    public void setRequestedTicket(Ticket requestedTicket) {
        this.requestedTicket = requestedTicket;
    }

    public String getSupervizorName() {
        return supervizorName;
    }

    public void setSupervizorName(String supervizorName) {
        this.supervizorName = supervizorName;
    }
}
