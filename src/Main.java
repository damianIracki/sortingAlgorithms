import algorithms.MergeSort;
import algorithms.QuickSort;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 12, 10, 7, -1, 234, 67, 109, 11};

        QuickSort.quickSort(numbers);
        System.out.print("Sorted by quickSort: ");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        System.out.println();

        int[] numbersToMergeSort = {5, 12, 12, 10, 7, -1, 234, 67, 109, 11};
        MergeSort.mergeSort(numbersToMergeSort);
        System.out.print("Sorted by mergeSort: ");
        for (int number : numbersToMergeSort) {
            System.out.print(number + ", ");
        }

        System.out.println();


    }
}
