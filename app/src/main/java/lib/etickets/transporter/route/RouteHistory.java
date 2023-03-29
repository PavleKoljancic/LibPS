package lib.etickets.transporter.route;

import java.util.Date;
import java.util.List;

import lib.etickets.terminal.ScanInterraction;

public class RouteHistory {
    Date fromDate;
    Date toDate;
    List<ScanInterraction> scanInterractions;
    String routeName;

    public RouteHistory() {
    }

    public RouteHistory(Date fromDate, Date toDate, List<ScanInterraction> scanInterractions, String routeName) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.scanInterractions = scanInterractions;
        this.routeName = routeName;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public List<ScanInterraction> getScanInterractions() {
        return scanInterractions;
    }

    public void setScanInterractions(List<ScanInterraction> scanInterractions) {
        this.scanInterractions = scanInterractions;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }
}
