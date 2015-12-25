package gojava.hw5.searchelement;


public class Search {
    public static void main(String[] args) {

        int[] array = {5, -34, 0, 67, 123, 63, 6, 89, 6, 43};
        int min = array[0];
        int max = array[0];

        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
            if (elem > max) {
                max = elem;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
