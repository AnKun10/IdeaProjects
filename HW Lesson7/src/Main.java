import entity.Driver;
import entity.DriverRouteSchedule;
import entity.Route;

import java.util.Scanner;

public class Main {

    public static Driver[] drivers = new Driver[90000];
    public static Route[] routes = new Route[900];
    public static DriverRouteSchedule[] driverRouteSchedules = new DriverRouteSchedule[90000];

    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        while (true){
            showMenu();
            int functionChoice = functionChoice();
            functionChoiceLogic(functionChoice);
        }
    }

    private static void functionChoiceLogic(int functionChoice) {
        switch (functionChoice) {
            case 1:
                addDriver();
                displayDriver();
                break;
            case 2:
                addRoute();
                displayRoute();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.exit(0);
        }
    }

    private static void addRoute() {
        int numb;
        do {
            System.out.print("Enter number of new routes: ");
            numb = new Scanner(System.in).nextInt();
            if (numb >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < numb; i++) {
            Route route = new Route();
            route.inputInfo();
            for (int j = 0; j < routes.length; j++) {
                if (routes[j] == null) {
                    routes[j] = route;
                    break;
                }
            }
        }
    }

    private static void displayRoute() {
        for (int i = 0; i < routes.length; i++) {
            if (routes[i] != null) {
                System.out.println((i + 1) + ", " + routes[i]);
            }
        }
    }

    private static int functionChoice() {
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 7) {
                break;
            }
            System.out.println("Invalid value, please try again!");
        } while (true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("-----------------BUS MENU----------------");
        System.out.println("1, Nhập danh sách Lái xe mới. In ra danh sách lái xe sau khi nhập.");
        System.out.println("2, Nhập danh sách Tuyến mới. In ra danh sách các tuyến sau khi nhập.");
        System.out.println("3, Nhập danh sách phân công cho mỗi lái xe và in danh sách ra màn hình.");
        System.out.println("4, Sắp xếp danh sách phân công theo họ tên lái xe");
        System.out.println("5, Sắp xếp danh sách phân công theo số lượng tuyến đảm nhận trong ngày (giảm dần)");
        System.out.println("6, Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe");
        System.out.println("7, Thoát");
        System.out.println("-----------------------------------------");
    }

    private static void displayDriver() {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] != null) {
                System.out.println((i + 1) + ", " + drivers[i]);
            }
        }
    }

    private static void addDriver() {
        int numb;
        do {
            System.out.print("Enter number of new drivers: ");
            numb = new Scanner(System.in).nextInt();
            if (numb >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < numb; i++) {
            Driver driver = new Driver();
            driver.inputInfo();
            for (int j = 0; j < drivers.length; j++) {
                if (drivers[j] == null) {
                    drivers[j] = driver;
                    break;
                }
            }
        }
    }
}
