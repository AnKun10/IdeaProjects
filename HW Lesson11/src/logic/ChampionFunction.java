package logic;

import constant.PositionConstant;
import entity.Champion;
import main.Main;

import java.util.Scanner;

public class ChampionFunction {
    private Champion input(Scanner scanner) {
        Champion champion = new Champion();
        System.out.print("Enter name: ");
        champion.setName(scanner.next());
        System.out.println("*** POSITIONS LIST ***");
        System.out.println("1, TOP LANE");
        System.out.println("2, JUNGLE");
        System.out.println("3, MID LANE");
        System.out.println("4, ADC");
        System.out.println("5, SUPPORT");
        System.out.println("**********************");
        int positionChoice;
        do {
            System.out.print("Enter postion: ");
            positionChoice = Integer.parseInt(scanner.next());
            if (positionChoice >= 1 && positionChoice <= 5) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (positionChoice) {
            case 1:
                champion.setPosition(PositionConstant.TOP.value);
                break;
            case 2:
                champion.setPosition(PositionConstant.JUNGLE.value);
                break;
            case 3:
                champion.setPosition(PositionConstant.MID.value);
                break;
            case 4:
                champion.setPosition(PositionConstant.ADC.value);
                break;
            case 5:
                champion.setPosition(PositionConstant.SUPPORT.value);
                break;
        }
        return champion;
    }

    public void add(Scanner scanner){
        System.out.println("#####################################");
        System.out.println("Adding 5 new champions to the pool...");
        for (int i = 0; i < 5; i++) {
            Main.champions.add(input(scanner));
        }
        System.out.println("#####################################");
    }

    public void display(Scanner scanner)
}
