package entity;

public class DriverScheduleDetail {
    private Route route;
    private int round;

    public DriverScheduleDetail(Route route, int round) {
        this.route = route;
        this.round = round;
    }

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
        return "DriverScheduleDetail{" +
                "route=" + route +
                ", round=" + round +
                '}';
    }
}
