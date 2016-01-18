package hw6.bouquet;

import java.util.ArrayList;

public class Bouquet {
    public ArrayList<Flower> flowersArrayList;

    public Bouquet() {
        this.flowersArrayList = new ArrayList<Flower>();
    }

    public void giveBouquet(Girl girl, Bouquet bouquet) {
        if (girl.getIsGoodMood())  //changed condition
        {
            System.out.println("Happy :)");
        } else {
            throw new IllegalStateException("Try another flowers.");
        }
    }
}
