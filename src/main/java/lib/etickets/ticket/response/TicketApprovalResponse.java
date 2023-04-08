package lib.etickets.ticket.response;

import java.time.LocalDate;

import lib.etickets.ticket.Ticket;

public class TicketApprovalResponse {

    User userId;
    LocalDate date;
    String comment;
    boolean approved;
    Ticket requestedTicket;
    String supervizorName;
    
    public TicketApprovalResponse(LocalDate date, String comment, boolean approved, Ticket requestedTicket,
            String supervizorName, String userId) {
        this.date = date;
        this.comment = comment;
        this.approved = approved;
        this.requestedTicket = requestedTicket;
        this.supervizorName = supervizorName;
        this.userId = userId;
    }

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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