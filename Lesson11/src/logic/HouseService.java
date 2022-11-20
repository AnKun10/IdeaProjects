package logic;

import entities.House;
import entities.Member;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseService implements Addable {

    public House input(Scanner scanner) {
        House house = new House();
        ArrayList<Member> members = new ArrayList<>();
        System.out.print("Enter address: ");
        house.setAddress(scanner.next());
        System.out.print("Enter number of members: ");
        int memberNumb = Integer.parseInt(scanner.next());
        for (int i = 0; i < memberNumb; i++) {
            do {
                boolean hasMember = false;
                System.out.print("Enter id of the " + i + " member: ");
                int id = Integer.parseInt(scanner.next());
                for (Member member : Main.members) {
                    if (member.getId() == id) {
                        members.add(member);
                        hasMember = true;
                        break;
                    }
                }
                if (hasMember) {
                    break;
                }
            } while (true);
        }
        house.setMembers(members);
        return house;
    }

    @Override
    public void add(Scanner scanner) {
        int houseNumb;
        do {
            System.out.println("Enter number of new houses: ");
            houseNumb = Integer.parseInt(scanner.next());
            if (houseNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        System.out.println("--------INPUT HOUSES--------");
        for (int i = 0; i < houseNumb; i++) {
            Main.houses.add(input(scanner));
        }
    }
}
