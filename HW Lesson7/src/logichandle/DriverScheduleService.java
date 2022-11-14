package logichandle;

import Main.Main;
import entity.Driver;
import entity.DriverSchedule;
import entity.DriverScheduleDetail;
import entity.Route;

import java.util.Scanner;

public class DriverScheduleService {
    public static void addDriverSchedule() {
        System.out.print("Enter number of new drivers' schedule: ");
        int driverNumb = new Scanner(System.in).nextInt();
        Driver driver = null;
        for (int i = 0; i < driverNumb; i++) {
            //addDriver
            driver = setDriver(driver, i + 1);
            //addDriverScheduleDetail
            System.out.print("Enter number of routes for driver " + driver.getName() + "(id: " + driver.getId() + "): ");
            int routeNumb = new Scanner(System.in).nextInt();
            Route route = null;
            DriverScheduleDetail[] driverScheduleDetails = new DriverScheduleDetail[routeNumb];
            int count = 0;
            for (int k = 0; k < routeNumb; k++) {
                route = setRoute(route, k + 1);
                System.out.print("Enter number of rounds for the route with id " + route.getId() + ": ");
                int roundNumb = new Scanner(System.in).nextInt();
                driverScheduleDetails[count] = new DriverScheduleDetail(route, roundNumb);
                count++;
            }
            //addDriverSchedule
            DriverSchedule driverSchedule = new DriverSchedule(driver, driverScheduleDetails);
            saveDriverSchedule(driverSchedule);
        }
    }

    private static Route setRoute(Route route, int routeNumb) {
        do {
            System.out.print("Enter id of route " + routeNumb + ": ");
            int routeId = new Scanner(System.in).nextInt();
            for (int h = 0; h < Main.routes.length; h++) {
                if (Main.routes[h] != null && Main.routes[h].getId() == routeId) {
                    route = Main.routes[h];
                    break;
                }
            }
            if (route != null) {
                return route;
            }
            System.out.print("Invalid route's id, please try again!");
        } while (true);
    }

    private static Driver setDriver(Driver driver, int driverNumb) {
        do {
            System.out.print("Enter id of driver " + driverNumb + ": ");
            int driverId = new Scanner(System.in).nextInt();
            for (int j = 0; j < Main.drivers.length; j++) {
                if (Main.drivers[j] != null && Main.drivers[j].getId() == driverId) {
                    driver = Main.drivers[j];
                    break;
                }
            }
            if (driver != null) {
                return driver;
            }
            System.out.println("Invalid driver's id, please try again!");
        } while (true);
    }

    private static void saveDriverSchedule(DriverSchedule driverSchedule) {
        for (int i = 0; i < Main.driverSchedules.length; i++) {
            if (Main.driverSchedules[i] == null) {
                Main.driverSchedules[i] = driverSchedule;
                return;
            }
        }
    }

    public static void displayDriverSchedule() {
        for (int i = 0; i < Main.driverSchedules.length; i++) {
            if (Main.driverSchedules[i] != null) {
                System.out.println((i + 1) + ", " + Main.driverSchedules[i]);
            }
        }
    }
}
