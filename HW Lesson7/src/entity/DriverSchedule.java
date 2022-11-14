package entity;

import java.util.Arrays;

public class DriverSchedule {
    private Driver driver;
    private DriverScheduleDetail[] driverScheduleDetails;
    public DriverSchedule(Driver driver, DriverScheduleDetail[] driverScheduleDetails) {
        this.driver = driver;
        this.driverScheduleDetails = driverScheduleDetails;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public DriverScheduleDetail[] getDriverScheduleDetails() {
        return driverScheduleDetails;
    }

    public void setDriverScheduleDetails(DriverScheduleDetail[] driverScheduleDetails) {
        this.driverScheduleDetails = driverScheduleDetails;
    }

    @Override
    public String toString() {
        return "DriverSchedule{" +
                "driver=" + driver +
                ", driverScheduleDetails=" + Arrays.toString(driverScheduleDetails) +
                '}';
    }
}
