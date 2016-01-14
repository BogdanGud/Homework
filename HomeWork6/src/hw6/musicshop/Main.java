package hw6.musicshop;

public class Main {
    public static void main(String[] args) throws notEnoughMoneyException {
        Customer bob = new Customer("Bob Marley", 8000);
        Guitar yamahaF310 = new Guitar(1250);
        MusicShop bestMusic = new MusicShop();
        bestMusic.musInstrArrayList.add(yamahaF310);
        try {
            bestMusic.saleInstrument(bob, bestMusic.musInstrArrayList.get(0));
        } catch (notEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
