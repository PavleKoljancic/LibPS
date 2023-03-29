package lib.etickets.users.administrator;

import java.util.List;

import lib.etickets.terminal.activationrequests.TerminalActivationRequest;
import lib.etickets.users.generaluser.GeneralUser;

public class Administrator extends GeneralUser{
    List<TerminalActivationRequest> terminalActivationRequests;

    public Administrator() {
    }

    public Administrator(String userId, String email, String firstName, String lastName,
            List<TerminalActivationRequest> terminalActivationRequests) {
        super(userId, email, firstName, lastName);
        this.terminalActivationRequests = terminalActivationRequests;
    }

    public List<TerminalActivationRequest> getTerminalActivationRequests() {
        return terminalActivationRequests;
    }

    public void setTerminalActivationRequests(List<TerminalActivationRequest> terminalActivationRequests) {
        this.terminalActivationRequests = terminalActivationRequests;
    }
    
}
