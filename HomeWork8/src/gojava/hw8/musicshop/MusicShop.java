package gojava.hw8.musicshop;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class MusicShop {
    public ArrayList<MusicInstrument> musInstrArrayList;
    public SortedSet instrumentTreeSet = new TreeSet<MusicInstrument>();

    public MusicShop() {
        this.musInstrArrayList = new ArrayList<MusicInstrument>();
        this.instrumentTreeSet = new TreeSet<MusicInstrument>();
    }
}