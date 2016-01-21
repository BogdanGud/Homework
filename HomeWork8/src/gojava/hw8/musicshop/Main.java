package gojava.hw8.musicshop;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guitar yamahaF310 = new Guitar("Yamahaf310", 1250, "stringed");
        Guitar cort = new Guitar("Cort", 1100, "stringed");
        Guitar eurofon = new Guitar("Eurofon", 950, "stringed");
        Piano roland = new Piano("Roland700", 25000, "keyboard");
        Piano kawai = new Piano("Kawai", 35000, "keyboard");

        MusicShop bestMusic = new MusicShop();
        PrintCollection print = new PrintCollection();

        bestMusic.musInstrArrayList.add(yamahaF310);
        bestMusic.musInstrArrayList.add(cort);
        bestMusic.musInstrArrayList.add(eurofon);
        bestMusic.musInstrArrayList.add(roland);
        bestMusic.musInstrArrayList.add(kawai);

        //1 method
        System.out.println("-----------1 method:");
        for (MusicInstrument instrument : bestMusic.musInstrArrayList) {
            bestMusic.instrumentTreeSet.add(instrument.getName());
        }
        print.toPrint(bestMusic.musInstrArrayList);
        System.out.println("Sorted:");
        for (Object treeSet : bestMusic.instrumentTreeSet) {
            for (MusicInstrument instrument : bestMusic.musInstrArrayList) {
                if (treeSet == instrument.getName())
                    System.out.println(instrument);
            }
        }

        //2 method
        System.out.println("-----------2 method:");
        bestMusic.musInstrArrayList
                .stream()
                .forEach(x -> System.out.println(x));
        bestMusic.musInstrArrayList
                .stream()
                .forEach(x -> bestMusic.instrumentTreeSet.add(x.getName()));
        System.out.println("Sorted:");
        for (Object treeSet : bestMusic.instrumentTreeSet) {
            System.out.println(bestMusic.musInstrArrayList
                    .stream()
                    .filter(name -> name.getName() == treeSet)
                    .findFirst()
                    .get());
        }
    }
}
