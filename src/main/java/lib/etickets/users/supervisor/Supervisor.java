package lib.etickets.users.supervisor;

import lib.etickets.transporter.Transporter;
import lib.etickets.users.generaluser.GeneralUser;

public class Supervisor extends GeneralUser{
    Transporter transporter;

    public Supervisor(String userId, String email, String firstName, String lastName, Transporter transporter) {
        super(userId, email, firstName, lastName);
        this.transporter = transporter;
    }
    
    public Supervisor(String userId, String email, String firstName, String lastName) {
        super(userId, email, firstName, lastName);
    }
    
    public Supervisor() {
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public void setTransporter(Transporter transporter) {
        this.transporter = transporter;
    }
    
}
