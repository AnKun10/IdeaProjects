package logic;

import constant.PositionConstant;
import entity.Champion;
import main.Main;

import java.util.Scanner;

public class ChampionFunction implements Addable, Displayable{
    //Create new Champion
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
        //Set position's value to Champion
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
    //Add new Champions to Champions pool
    @Override
    public void add(Scanner scanner){
        int champNumb;
        do {
            System.out.print("Enter number of new Champions: ");
            champNumb = Integer.parseInt(scanner.next());
            if (champNumb>0){
                break;
            }
            System.out.println("Invalid input, please try again!");
        }while (true);
        for (int i = 0; i < champNumb; i++) {
            Main.champions.add(input(scanner));
        }
    }
    //Display Champions
    @Override
    public void display(){
        if (Main.champions.size()==0){
            System.out.println("\tThere aren't any Champions yet!");
        }
        for (Champion champion : Main.champions) {
            System.out.println("\t"+champion);
        }
    }
}
