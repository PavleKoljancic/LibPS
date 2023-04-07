package lib.etickets.transporter;

import java.util.List;

import lib.etickets.transporter.route.Route;



public class Transporter {
    String name;
    String transporterId;
    List<Route> routes;

    public Transporter(String name, String transporterId, List<Route> routes) {
        this.name = name;
        this.transporterId = transporterId;
        this.routes = routes;
    }

    public Transporter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransporterId() {
        return transporterId;
    }

    public void setTransporterId(String transporterId) {
        this.transporterId = transporterId;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
