package hw6.musicshop;


import java.util.ArrayList;

public class MusicShop {
    public ArrayList<MusicInstrument> musInstrArrayList;

    public MusicShop() {
        this.musInstrArrayList = new ArrayList<MusicInstrument>();
    }

    public void saleInstrument(Customer customer,MusicInstrument instrument ) throws notEnoughMoneyException {
        if(customer.getAccountBalance()>= instrument.getPrice())    //changed condition: using Getter
        {
            System.out.println("Instrument bought");
        }
        else {
            throw new notEnoughMoneyException("Not enough money in account!");
        }
    }
}
