package logic;

import entity.Follower;
import entity.Idol;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService implements Addable, Displayable {
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
            boolean hasFollower = false;
            for (Follower follower : Main.followers) {
                if (follower.getId() == id) {
                    hasFollower = true;
                    //User try to Add > 1 of the Same Follower
                    if (followersTemp.contains(follower)) {
                        System.out.println("This idol already has this follower's id, please try again!");
                        i--;
                        break;
                    }
                    //User successfully Add Follower
                    followersTemp.add(follower);
                }
            }
            //User try to Add None Exiting Follower
            if (!hasFollower) {
                System.out.println("There aren't any follower with this id in the data, please try again!");
                i--;
            }
        }
        idol.setFollowers(followersTemp);
        return idol;
    }

    @Override
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

    @Override
    //Display all the Idols in Main Idols List
    public void display() {
        for (Idol idol : Main.idols) {
            System.out.println("\t" + idol);
        }
    }
}
