package hw6.musicshop;


public abstract class MusicInstrument {
    int price;
    public MusicInstrument(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
