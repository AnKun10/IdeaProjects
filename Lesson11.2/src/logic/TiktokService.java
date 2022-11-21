package logic;

import entity.Idol;
import entity.Song;
import entity.Tiktok;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class TiktokService {
    //Create new Tiktok
    private Tiktok input(Scanner scanner) {
        Tiktok tiktok = new Tiktok();
        ArrayList<Idol> idolsTemp = new ArrayList<>();
        ArrayList<Song> songsTemp = new ArrayList<>();
        //Create new Idols List for Tiktok
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
            int repeatId = 0;
            for (Idol idol : Main.idols) {
                if (idol.getId() == id) {
                    idolsTemp.add(idol);
                    repeatId++;
                }
                //User try to Add > 1 of the Same Idol
                if (repeatId > 1) {
                    idolsTemp.remove(idol);
                    System.out.println("This tiktok already has this idol's id, please try again!");
                    i--;
                    break;
                }
            }
            //User try to Add None Exiting Idol
            if (repeatId < 1) {
                System.out.println("There aren't any idol with this id in the data, please try again!");
                i--;
            }
        }
        tiktok.setIdols(idolsTemp);
        //Create new Songs List for Tiktok
        int songNumb;
        do {
            System.out.print("Enter number of songs (at most " + Main.songs.size() + " songs): ");
            songNumb = Integer.parseInt(scanner.next());
            if (songNumb <= Main.songs.size() && songNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < songNumb; i++) {
            //Find Song's id
            System.out.print("Enter the " + (i + 1) + " song's id: ");
            int id = Integer.parseInt(scanner.next());
            int repeatId = 0;
            for (Song song : Main.songs) {
                if (song.getId() == id) {
                    songsTemp.add(song);
                    repeatId++;
                }
                //User try to Add > 1 of the Same Song
                if (repeatId > 1) {
                    songsTemp.remove(song);
                    System.out.println("This tiktok already has this song's id, please try again!");
                    i--;
                    break;
                }
            }
            //User try to Add None Exiting Song
            if (repeatId < 1) {
                System.out.println("There aren't any song with this id in the data, please try again!");
                i--;
            }
        }
        tiktok.setSongs(songsTemp);
        return tiktok;
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
