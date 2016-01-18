package hw6.bouquet;


public class Main {
    public static void main(String[] args) {
        Girl emma = new Girl("Emma", true);
        Bouquet bouquet = new Bouquet();
        try {
            bouquet.giveBouquet(emma, bouquet);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
