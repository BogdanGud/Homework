package hw6.musicshop;


public abstract class MusicInstrument {
    private int price;      //declared as private
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
