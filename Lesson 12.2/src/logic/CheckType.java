package logic;

import java.util.Scanner;

public class CheckType {
    public int newInt(Scanner scanner){
        int numb;
        do {
            try {
                numb = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.print("Invalid input, please enter again: ");
            }
        } while (true);
        return numb;
    }
    public double newDouble(Scanner scanner){
        double numb;
        do {
            try {
                numb = Double.parseDouble(scanner.next());
                break;
            } catch (Exception e) {
                System.out.print("Invalid input, please enter again");
            }
        } while (true);
        return numb;
    }
}
