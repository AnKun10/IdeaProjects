package logic;

import entity.Idol;
import entity.Song;
import entity.Tiktok;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

import static main.Main.songs;

public class TiktokService {
    //Create new Tiktok
    private Tiktok input(Scanner scanner) {
        Tiktok tiktok = new Tiktok();
        //Create new Idols List for Tiktok
        tiktok.setIdols(idols(scanner));
        //Create new Songs List for Tiktok
        tiktok.setSongs(songs(scanner));
        return tiktok;
    }

    //Create new Songs List for Tiktok
    private ArrayList<Song> songs(Scanner scanner) {
        ArrayList<Song> songsTemp = new ArrayList<>();
        int songNumb;
        do {
            System.out.print("Enter number of songs (at most " + Main.songs.size() + " songs): ");
            songNumb = Integer.parseInt(scanner.next());
            if (songNumb <= Main.songs.size() && songNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int j = 0; j < songNumb; j++) {
            //Find Song's id
            System.out.print("Enter the " + (j + 1) + " song's id: ");
            int id = Integer.parseInt(scanner.next());
            boolean hasSong = false;
            for (Song song : Main.songs) {
                if (song.getId() == id) {
                    hasSong = true;
                    //User try to Add > 1 of the Same Song
                    if (songsTemp.contains(song)) {
                        System.out.println("This tiktok already has this song's id, please try again!");
                        j--;
                        break;
                    }
                    //User successfully Add Song
                    songsTemp.add(song);
                }
            }
            //User try to Add None Exiting Song
            if (!hasSong) {
                System.out.println("There aren't any song with this id in the data, please try again!");
                j--;
            }
        }
        return songsTemp;
    }

    //Create Idols List for Tiktok
    private ArrayList<Idol> idols(Scanner scanner) {
        ArrayList<Idol> idolsTemp = new ArrayList<>();
        int idolNumb;
        do {
            System.out.print("Enter number of idols (at most " + Main.idols.size() + " idols): ");
            idolNumb = Integer.parseInt(scanner.next());
            if (idolNumb <= Main.idols.size() && idolNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < idolNumb; i++) {
            //Find idol's id
            System.out.print("Enter the " + (i + 1) + " idol's id: ");
            int id = Integer.parseInt(scanner.next());
            boolean hasIdol = false;
            for (Idol idol : Main.idols) {
                if (idol.getId() == id) {
                    hasIdol = true;
                    //User try to Add > 1 of the Same Idol
                    if (idolsTemp.contains(idol)) {
                        System.out.println("This tiktok already has this idol's id, please try again!");
                        i--;
                        break;
                    }
                    //User successfully Add Idol
                    idolsTemp.add(idol);
                }
            }
            //User try to Add None Exiting Idol
            if (!hasIdol) {
                System.out.println("There aren't any idol with this id in the data, please try again!");
                i--;
            }
        }
        return idolsTemp;
    }

    //Add new Tiktoks to the Main Tiktoks List
    public void add(Scanner scanner) {
        int tiktokNumb;
        do {
            System.out.print("Enter number of new tiktoks: ");
            tiktokNumb = Integer.parseInt(scanner.next());
            if (tiktokNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < tiktokNumb; i++) {
            Main.tiktoks.add(input(scanner));
        }
    }

    //Display all the Tiktoks in Main Tiktoks List
    public void display() {
        for (Tiktok tiktok : Main.tiktoks) {
            System.out.println("\t" + tiktok);
        }
    }
}
