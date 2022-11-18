package logic;

import entity.Member;
import main.Main;

import java.util.Scanner;

public class MemberService implements Addable, Displayable {
    public static void add() {
        int membNumb;
        do {
            System.out.print("Enter number of new members (at least 3): ");
            membNumb = new Scanner(System.in).nextInt();
            if (membNumb >= 3) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < membNumb; i++) {
            Member member = new Member();
            member.inputInfo();
            Main.members.add(member);
        }
    }

    public static void display() {
        System.out.print("The updated member list: ");
        for (Member member : Main.members) {
            System.out.print(member + "\t");
        }
    }
}
