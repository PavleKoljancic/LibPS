package lib.etickets.ticket.requests;

import org.w3c.dom.Document;

import lib.etickets.ticket.Ticket;


public class TicketRequest {
    public String ticketRequestId;
    public String userId;
    public Ticket requestedTicket;
    Document document;

    public TicketRequest() {
    }

    public TicketRequest(String ticketRequestId, String userId, Ticket requestedTicket, Document document) {
        this.ticketRequestId = ticketRequestId;
        this.userId = userId;
        this.document = document;
        this.requestedTicket = requestedTicket;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userID) {
        this.userId = userID;
    }
    public Ticket getRequestedTicket() {
        return requestedTicket;
    }
    public void setRequestedTicket(Ticket requestedTicket) {
        this.requestedTicket = requestedTicket;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getTicketRequestId() {
        return ticketRequestId;
    }

    public void setTicketRequestId(String ticketRequestId) {
        this.ticketRequestId = ticketRequestId;
    }
}
