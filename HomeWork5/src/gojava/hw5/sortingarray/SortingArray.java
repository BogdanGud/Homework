package gojava.hw5.sortingarray;


public class SortingArray {
    public static void main(String[] args) {
        int[] array = {5, -27, 34, 67, 0, 123, 63, 6, 89, 6, 43};
        int[] sortedArray = bobbleSort(array);
        printArray(sortedArray);

    }

    public static int[] bobbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
