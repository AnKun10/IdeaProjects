package logic_handle;

import entity.Reporter;

import java.util.Scanner;

public class ReporterService {
    public static Reporter[] reporters = new Reporter[90000];
    public static void displayReporter() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null){
                System.out.println((i+1)+", "+reporters[i]);
            }
        }
    }

    public static void addReporter() {
        int numb;
        do {
            System.out.print("Enter number of new reporters: ");
            numb = new Scanner(System.in).nextInt();
            if (numb >=0){
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < numb; i++) {
            Reporter reporter = new Reporter();
            reporter.inputInfo();
            for (int j = 0; j < reporters.length; j++) {
                if (reporters[j] == null){
                    reporters[j] = reporter;
                }
            }
        }
    }
}
