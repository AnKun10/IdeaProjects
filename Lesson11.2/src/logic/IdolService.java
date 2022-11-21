package logic;

import entity.Follower;
import entity.Idol;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {
    //Create new Idol
    private Idol input(Scanner scanner) {
        Idol idol = new Idol();
        ArrayList<Follower> followersTemp = new ArrayList<>();
        System.out.print("Enter idol's name: ");
        idol.setName(scanner.next());
        System.out.print("Enter idol's email: ");
        idol.setEmail(scanner.next());
        System.out.print("Enter idol's group: ");
        idol.setGroup(scanner.next());
        //Create new Followers List for Idol
        int followerNumb;
        do {
            System.out.print("Enter number of followers (at most " + Main.followers.size() + " followers): ");
            followerNumb = Integer.parseInt(scanner.next());
            if (followerNumb <= Main.followers.size() && followerNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < followerNumb; i++) {
            //Find follower's id
            System.out.print("Enter the " + (i + 1) + " follower's id: ");
            int id = Integer.parseInt(scanner.next());
            int repeatId = 0;
            for (Follower follower : Main.followers) {
                if (follower.getId() == id) {
                    followersTemp.add(follower);
                    repeatId++;
                }
                //User try to Add > 1 of the Same Follower
                if (repeatId > 1) {
                    for (int j = 0; j < repeatId; j++) {
                        followersTemp.remove(follower);
                    }
                    System.out.println("This idol already has this follower's id, please try again!");
                    i--;
                }
            }
            //User try to Add None Exiting Follower
            if (repeatId < 1) {
                System.out.println("There aren't any follower with this id in the data, please try again!");
                i--;
            }
        }
        idol.setFollowers(followersTemp);
        return idol;
    }

    //Add new Idols to the Main Idols List
    public void add(Scanner scanner) {
        int idolNumb;
        do {
            System.out.print("Enter number of new idols: ");
            idolNumb = Integer.parseInt(scanner.next());
            if (idolNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < idolNumb; i++) {
            Main.idols.add(input(scanner));
        }
    }

    //Display all the Idols in Main Idols List
    public void display() {
        for (Idol idol : Main.idols) {
            System.out.println("\t" + idol);
        }
    }
}
