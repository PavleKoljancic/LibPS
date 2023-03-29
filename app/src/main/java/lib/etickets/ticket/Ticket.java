package lib.etickets.ticket;

import java.util.List;

import lib.etickets.transporter.Transporter;


public abstract class Ticket {
    String name;
    int ticketId;
    boolean needsDocumentation;
    List<Transporter> transporters;
    double price;

    
    public Ticket(String name, int ticketId, boolean needsDocumentation, List<Transporter> transporters, double price) {
        this.name = name;
        this.ticketId = ticketId;
        this.needsDocumentation = needsDocumentation;
        this.transporters = transporters;
        this.price = price;
    }

    
    public Ticket() {
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getTicketId() {
        return ticketId;
    }


    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }


    public boolean isNeedsDocumentation() {
        return needsDocumentation;
    }


    public void setNeedsDocumentation(boolean needsDocumentation) {
        this.needsDocumentation = needsDocumentation;
    }


    public List<Transporter> getTransporters() {
        return transporters;
    }


    public void setTransporters(List<Transporter> transporters) {
        this.transporters = transporters;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
