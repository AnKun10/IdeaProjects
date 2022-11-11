package entity;

import java.util.Arrays;
import java.util.Scanner;

public class DriverRouteSchedule implements Inputable {
    private Driver driver;
    private Driver[] drivers;
    private DriverRouteScheduleDetail[] driverRouteScheduleDetails;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public DriverRouteScheduleDetail[] getDriverRouteScheduleDetails() {
        return driverRouteScheduleDetails;
    }

    public void setDriverRouteScheduleDetails(DriverRouteScheduleDetail[] driverRouteScheduleDetails) {
        this.driverRouteScheduleDetails = driverRouteScheduleDetails;
    }

    @Override
    public String toString() {
        return "DriverRouteSchedule{" +
                "driver=" + driver +
                ", driverRouteScheduleDetails=" + Arrays.toString(driverRouteScheduleDetails) +
                '}';
    }

    @Override
    public void inputInfo() {
        int schedule;
        do {
            System.out.print("Enter number of new drivers' schedule: ");
            schedule = new Scanner(System.in).nextInt();
            if (schedule >= 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        
        int id;
        for (int i = 0; i < schedule; i++) {
            System.out.print("Enter driver "+(i+1)+" id: ");
            id = new Scanner(System.in).nextInt();
            for (int j = 0; j < drivers.length; j++) {
                if (id == drivers[0].getId()){
                    this.driver
                }
            }
        }
    }
}
