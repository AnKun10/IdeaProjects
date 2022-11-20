package logic;

import entity.Song;
import main.Main;

import java.util.Scanner;

public class SongService {
    private Song input(Scanner scanner){
        Song song = new Song();
        System.out.print("Enter song's name: ");
        song.setName(scanner.next());
        System.out.print("Enter song's singer: ");
        song.setSinger(scanner.next());
        return song;
    }
    public void add(Scanner scanner){
        System.out.print("Enter number of new songs: ");
        int songNumb = Integer.parseInt(scanner.next());
        for (int i = 0; i < songNumb; i++) {
            Main.songs.add(input(scanner));
        }
    }
}
