package logic;

import entity.Follower;
import entity.Idol;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {
    private Idol input(Scanner scanner){
        Idol idol = new Idol();
        ArrayList<Follower> followersTemp = new ArrayList<>();
        System.out.print("Enter idol's name: ");
        idol.setName(scanner.next());
        System.out.print("Enter idol's email: ");
        idol.setEmail(scanner.next());
        System.out.print("Enter idol's group: ");
        idol.setGroup(scanner.next());
        System.out.print("Enter number of followers: ");
        int followerNumb = Integer.parseInt(scanner.next());
        for (int i = 0; i < followerNumb; i++) {
            System.out.print("Enter the "+(i+1)+" follower's id: ");
            int id = Integer.parseInt(scanner.next());
            for (Follower follower : Main.followers) {
                if (follower.getId() == id){
                    Main.followers.add(follower);
                    break;
                }
            }
        }
        idol.setFollowers(followersTemp);
        return idol;
    }
    public void add(Scanner scanner){
        System.out.print("Enter number of new idols: ");
        int idolNumb = Integer.parseInt(scanner.next());
        for (int i = 0; i < idolNumb; i++) {
            Main.idols.add(input(scanner));
        }
    }
}
