package lib.etickets.terminal.activationrequests;

public class TerminalActivationRequest {
    
    String transporterId;
    String terminalSerialNumber;
    
    public TerminalActivationRequest() {
    }

    public TerminalActivationRequest(String transporterId, String terminalSerialNumber) {
        this.transporterId = transporterId;
        this.terminalSerialNumber = terminalSerialNumber;
    }

    public String getTransporterId() {
        return transporterId;
    }

    public void setTransporterId(String transporterId) {
        this.transporterId = transporterId;
    }

    public String getTerminalSerialNumber() {
        return terminalSerialNumber;
    }

    public void setTerminalSerialNumber(String terminalSerialNumber) {
        this.terminalSerialNumber = terminalSerialNumber;
    }
}
