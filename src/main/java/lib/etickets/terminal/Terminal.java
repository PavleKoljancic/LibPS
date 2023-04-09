package lib.etickets.terminal;

import java.util.List;

import lib.etickets.transporter.Transporter;
import lib.etickets.transporter.route.RouteHistory;

public class Terminal {
    Transporter transporter;
    String terminalId;
    String terminalSerialNumber;
    List<RouteHistory> routeHistory;

    public Terminal() {
    }

    public Terminal(Transporter transporter, String terminalId, String terminalSerialNumber, List<RouteHistory> routeHistory) {
        this.transporter = transporter;
        this.terminalId = terminalId;
        this.terminalSerialNumber = terminalSerialNumber;
        this.routeHistory = routeHistory;
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

    public List<RouteHistory> getRouteHistory() {
        return routeHistory;
    }

    public void setRouteHistory(List<RouteHistory> routeHistory) {
        this.routeHistory = routeHistory;
    }
}
