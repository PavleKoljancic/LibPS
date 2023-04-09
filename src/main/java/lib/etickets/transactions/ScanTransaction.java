package lib.etickets.transactions;

import java.time.LocalDate;

public class ScanTransaction extends Transaction{
    String terminalId;

    public ScanTransaction() {
    }

    public ScanTransaction(String userId, double amount, LocalDate date, String terminalId) {
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
