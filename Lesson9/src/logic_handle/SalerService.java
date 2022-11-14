package logic_handle;

import entity.Saler;
import main.Main;

import java.util.Scanner;

public class SalerService implements Addable,Displayable{
    public static void displaySaler() {
        for (int i = 0; i < Main.salers.length; i++) {
            if (Main.salers[i] != null) {
                System.out.println((i + 1) + ", " + Main.salers[i]);
            }
        }
    }

    public static void addSaler() {
        int numb;
        do {
            System.out.print("Enter number of new salers: ");
            numb = new Scanner(System.in).nextInt();
            if (numb >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < numb; i++) {
            Saler saler = new Saler();
            saler.infoInput();
            for (int j = 0; j < Main.salers.length; j++) {
                if (Main.salers[j] == null) {
                    Main.salers[j] = saler;
                    break;
                }
            }
        }
    }
}
