package lib.etickets.transactions;

import java.util.Date;

public class ScanTransaction extends Transaction{
    String terminalId;

    public ScanTransaction() {
    }

    public ScanTransaction(String userId, double amount, Date date, String terminalId) {
        super(userId, amount, date);
        this.terminalId = terminalId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
    
}
