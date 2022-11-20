package logic;

import entity.Follower;
import main.Main;

import java.util.Scanner;

public class FollowerService {
    public Follower input(Scanner scanner){
        Follower follower = new Follower();
        System.out.print("Enter follower's name: ");
        follower.setName(scanner.next());
        System.out.print("Enter follower's email: ");
        follower.setEmail(scanner.next());
        System.out.print("Enter follower's likes: ");
        follower.setLikeNumb(Integer.parseInt(scanner.next()));
        return follower;
    }

    public void add(Scanner scanner){
        System.out.print("Enter number of new followers: ");
        int followerNumb = Integer.parseInt(scanner.next());
        for (int i = 0; i < followerNumb; i++) {
            Main.followers.add(input(scanner));
        }
    }
}
