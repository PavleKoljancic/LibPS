package lib.etickets.ticket.response;

import java.time.LocalDate;

import lib.etickets.ticket.Ticket;

public class TicketApprovalResponse {

    LocalDate date;
    String comment;
    boolean approved;
    Ticket requestedTicket;
    String supervisorName;

    public TicketApprovalResponse(LocalDate date, String comment, boolean approved, Ticket requestedTicket,
            String supervisorName) {
        this.date = date;
        this.comment = comment;
        this.approved = approved;
        this.requestedTicket = requestedTicket;
        this.supervisorName = supervisorName;
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

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }
}