package logic;

import entity.Song;
import main.Main;

import java.util.Scanner;

public class SongService {
    //Create new Song
    private Song input(Scanner scanner) {
        Song song = new Song();
        System.out.print("Enter song's name: ");
        song.setName(scanner.next());
        System.out.print("Enter song's singer: ");
        song.setSinger(scanner.next());
        return song;
    }
    //Add new Songs to the Main Songs List
    public void add(Scanner scanner) {
        int songNumb;
        do {
            System.out.print("Enter number of new songs: ");
            songNumb = Integer.parseInt(scanner.next());
            if (songNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < songNumb; i++) {
            Main.songs.add(input(scanner));
        }
    }
    //Display all the Songs in Main Songs List
    public void display() {
        for (Song song : Main.songs) {
            System.out.println("\t" + song);
        }
    }
}
