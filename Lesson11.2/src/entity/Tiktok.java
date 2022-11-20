package entity;

import entity.Idol;
import entity.Song;

import java.util.ArrayList;

public class Tiktok {
    private ArrayList<Idol> idols;
    private ArrayList<Song> songs;

    public ArrayList<Idol> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "entity.Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
