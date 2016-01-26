package gojava.hw9;

import java.util.*;

public class MusicShop {
    private ArrayList<MusicInstrument> instrumentList;
    Encoder encoder = new Encoder(3);

    public MusicShop() {
        this.instrumentList = new ArrayList<MusicInstrument>();
    }

    public void addInstrument(MusicInstrument instrument) {
        instrument.setName(encoder.encode(instrument.getName()));
        instrument.setType(encoder.encode((instrument.getType())));
        this.instrumentList.add(instrument);
    }

    public void printDecryptList() {
        int i = 0;
        while (i < instrumentList.size()) {
            instrumentList.get(i).setName(encoder.decode(instrumentList.get(i).getName()));
            instrumentList.get(i).setType(encoder.decode(instrumentList.get(i).getType()));
            System.out.println(instrumentList.get(i));
            i++;
        }
    }

    public void printEcryptList() {
        for (Object obj : instrumentList) {
            System.out.println(obj);
        }
    }
}