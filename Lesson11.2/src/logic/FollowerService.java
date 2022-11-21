package logic;

import entity.Follower;
import main.Main;

import java.util.Scanner;

public class FollowerService {
    //Create new Follower
    private Follower input(Scanner scanner) {
        Follower follower = new Follower();
        System.out.print("Enter follower's name: ");
        follower.setName(scanner.next());
        System.out.print("Enter follower's email: ");
        follower.setEmail(scanner.next());
        do {
            System.out.print("Enter follower's likes: ");
            follower.setLikeNumb(Integer.parseInt(scanner.next()));
            if (follower.getLikeNumb() >= 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        return follower;
    }
    //Add new Followers to the Main Followers List
    public void add(Scanner scanner) {
        int followerNumb;
        do {
            System.out.print("Enter number of new followers: ");
            followerNumb = Integer.parseInt(scanner.next());
            if (followerNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < followerNumb; i++) {
            Main.followers.add(input(scanner));
        }
    }
    //Display all the Followers in Main Followers List
    public void display() {
        for (Follower follower : Main.followers) {
            System.out.println("\t" + follower);
        }
    }
}
