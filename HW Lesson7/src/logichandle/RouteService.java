package logichandle;

import Main.Main;
import entity.Route;

import java.util.Scanner;

public class RouteService {
    public static void addRoute() {
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
            for (int j = 0; j < Main.routes.length; j++) {
                if (Main.routes[j] == null) {
                    Main.routes[j] = route;
                    break;
                }
            }
        }
    }

    public static void displayRoute() {
        for (int i = 0; i < Main.routes.length; i++) {
            if (Main.routes[i] != null) {
                System.out.println((i + 1) + ", " + Main.routes[i]);
            }
        }
    }
}
