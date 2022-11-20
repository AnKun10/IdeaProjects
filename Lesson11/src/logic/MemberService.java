package logic;

import entities.Member;
import main.Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberService implements Addable {

    public Member input(Scanner scanner) {
        Member member = new Member();
        System.out.print("Enter name: ");
        member.setName(scanner.next());
        System.out.print("Enter date of birth (dd/MM/yyyy): ");
        member.setDob(LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.print("Enter job: ");
        member.setJob(scanner.next());
        return member;
    }

    @Override
    public void add(Scanner scanner) {
        int memberNumb;
        do {
            System.out.println("Enter number of new members: ");
            memberNumb = Integer.parseInt(scanner.next());
            if (memberNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < memberNumb; i++) {
            Main.members.add(input(scanner));
        }
    }

    public void display() {
        for (Member member : Main.members) {
            System.out.println(member);
        }
    }
}
