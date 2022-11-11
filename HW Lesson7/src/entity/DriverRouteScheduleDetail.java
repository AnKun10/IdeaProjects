package entity;

public class DriverRouteScheduleDetail {
    private Route route;
    private int round;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "DriverRouteScheduleDetail{" +
                "route=" + route +
                ", round=" + round +
                '}';
    }
}
