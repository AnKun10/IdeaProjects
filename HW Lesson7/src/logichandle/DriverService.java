package logichandle;

import Main.Main;
import entity.Driver;

import java.util.Scanner;

public class DriverService {
    public static void displayDriver() {
        for (int i = 0; i < Main.drivers.length; i++) {
            if (Main.drivers[i] != null) {
                System.out.println((i + 1) + ", " + Main.drivers[i]);
            }
        }
    }

    public static void addDriver() {
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
            for (int j = 0; j < Main.drivers.length; j++) {
                if (Main.drivers[j] == null) {
                    Main.drivers[j] = driver;
                    break;
                }
            }
        }
    }
}
