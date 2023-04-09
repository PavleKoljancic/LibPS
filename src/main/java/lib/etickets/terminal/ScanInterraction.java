package lib.etickets.terminal;

import java.time.LocalDateTime;

public class ScanInterraction {
    String userId;
    String terminalId;
    LocalDateTime time;

    public ScanInterraction() {
    }

    public ScanInterraction(String userId, String terminalId, LocalDateTime time) {
        this.userId = userId;
        this.terminalId = terminalId;
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public LocalDateTime getTime() {
        return time;
    }
    
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
