package gojava.hw5.searchelement;


public class Search {
    public static void main(String[] args) {
        int[] array = {5, -34, 0, 67, 123, 63, 6, 89, 6, 43};
        int minimum = minSearch(array);
        int maximum = maxSearch(array);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }

    public static int minSearch(int[] array) {
        int min = array[0];
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public static int maxSearch(int[] array) {
        int max = array[0];
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }
}

