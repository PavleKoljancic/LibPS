package lib.etickets.terminal;

import lib.etickets.transporter.Transporter;

public class Terminal {
    Transporter transporter;
    String terminalId;
    String terminalSerialNumber;

    public Terminal() {
    }

    public Terminal(Transporter transporter, String terminalId, String terminalSerialNumber) {
        this.transporter = transporter;
        this.terminalId = terminalId;
        this.terminalSerialNumber = terminalSerialNumber;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public void setTransporter(Transporter transporter) {
        this.transporter = transporter;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalSerialNumber() {
        return terminalSerialNumber;
    }
    
    public void setTerminalSerialNumber(String terminalSerialNumber) {
        this.terminalSerialNumber = terminalSerialNumber;
    }
}
