package logic;

import entity.Idol;
import entity.Song;
import entity.Tiktok;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class TiktokService {
    public void add(Scanner scanner){
        System.out.print("Enter number of new tiktoks: ");
        int tiktokNumb = Integer.parseInt(scanner.next());
        for (int i = 0; i < tiktokNumb; i++) {
            Main.tiktoks.add(input(scanner));
        }
    }

    private Tiktok input(Scanner scanner) {
        Tiktok tiktok = new Tiktok();
        ArrayList<Idol> idolsTemp = new ArrayList<>();
        ArrayList<Song> songsTemp = new ArrayList<>();
        System.out.print("Enter number of idols: ");
        int idolNumb=Integer.parseInt(scanner.next());
        for (int i = 0; i < idolNumb; i++) {
            System.out.print("Enter the "+(i+1)+" idol's id: ");
            int id = Integer.parseInt(scanner.next());
            for (Idol idol: Main.idols) {
                if (idol.getId()==id){
                    idolsTemp.add(idol);
                    break;
                }
            }
        }
        tiktok.setIdols(idolsTemp);
        System.out.print("Enter number of songs: ");
        int songNumb = Integer.parseInt(scanner.next());
        for (int i = 0; i < songNumb; i++) {
            System.out.print("Enter the "+(i+1)+" song's id: ");
            int id = Integer.parseInt(scanner.next());
            for (Song song : Main.songs) {
                if (song.getId()==id){
                    songsTemp.add(song);
                }
            }
        }
        tiktok.setSongs(songsTemp);
        return tiktok;
    }
}
