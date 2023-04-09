package lib.etickets.users.user;


import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import lib.etickets.ticket.Ticket;
import lib.etickets.ticket.response.TicketApprovalResponse;
import lib.etickets.users.generaluser.GeneralUser;



public class User extends GeneralUser{

    Image userImage;
    List<File> documents;
    double credit;
    List<Ticket> myTickets = new ArrayList<>();
    List<TicketApprovalResponse> ticketApprovalResponses = new ArrayList<>();

    public User(String userId, String email, String firstName, String lastName, Image userImage,
            List<File> documents, double credit) {
        super(userId, email, firstName, lastName);
        this.userImage = userImage;
        this.documents = documents;
        this.credit = credit;
    }

    public User() {
    }

    public Image getUserImage() {
        return userImage;
    }

    public void setUserImage(Image userImage) {
        this.userImage = userImage;
    }

    public List<File> getDocuments() {
        return documents;
    }

    public void setDocuments(List<File> documents) {
        this.documents = documents;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public List<Ticket> getMyTickets() {
        return myTickets;
    }

    public void setMyTickets(List<Ticket> myTickets) {
        this.myTickets = myTickets;
    }

    public List<TicketApprovalResponse> getTicketApprovalResponses(){
        return ticketApprovalResponses;
    }
    
    public void setTicketApprovalResponses(List<TicketApprovalResponse> ticketApprovalResponses){
        this.ticketApprovalResponses = ticketApprovalResponses;
    }
}
