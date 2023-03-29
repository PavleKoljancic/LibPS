package lib.etickets.ticket.response;

public class TicketResponse {
    String comment;
    int ticketRequestID;
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public int getTicketRequestID() {
        return ticketRequestID;
    }
    public void setTicketRequestID(int ticketRequestID) {
        this.ticketRequestID = ticketRequestID;
    }
    public TicketResponse() {
    }
}
