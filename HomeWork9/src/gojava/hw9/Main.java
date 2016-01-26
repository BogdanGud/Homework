package gojava.hw9;

public class Main {
    public static void main(String[] args) {
        Guitar fender = new Guitar("Fender", 1250, "stringed");
        Guitar cort = new Guitar("Cort", 1100, "stringed");
        Guitar eurofon = new Guitar("Eurofon", 950, "stringed");
        Piano roland = new Piano("Roland700", 25000, "piano");
        Piano kawai = new Piano("Kawai", 35000, "piano");

        MusicShop bestMusic = new MusicShop();

        bestMusic.addInstrument(fender);
        bestMusic.addInstrument(eurofon);
        bestMusic.addInstrument(cort);
        bestMusic.addInstrument(kawai);
        bestMusic.addInstrument(roland);

        System.out.println("Encrypted list:");
        bestMusic.printEcryptList();
        System.out.println("Decrypted list:");
        bestMusic.printDecryptList();
    }
}
