import algorithms.*;

public class Main {

    public static void main(String[] args) {

        int[] numbersToQuickSort = SupportedUtils.creatingRandomNumberArray();
        long start = System.currentTimeMillis();
        QuickSort.quickSort(numbersToQuickSort);
        System.out.print("Sorted by quickSort: ");
        SupportedUtils.printArray(numbersToQuickSort);
        System.out.print("Sort time: " + (System.currentTimeMillis() - start));

        System.out.println();

        int[] numbersToMergeSort = SupportedUtils.creatingRandomNumberArray();
        start = System.currentTimeMillis();
        MergeSort.mergeSort(numbersToMergeSort);
        System.out.print("Sorted by mergeSort: ");
        SupportedUtils.printArray(numbersToMergeSort);
        System.out.print("Sort time: " + (System.currentTimeMillis() - start));

        System.out.println();

        int[] numbersToHeapSort = SupportedUtils.creatingRandomNumberArray();
        start = System.currentTimeMillis();
        HeapSort.heapSort(numbersToHeapSort);
        System.out.print("Sorted by heapSort: ");
        SupportedUtils.printArray(numbersToHeapSort);
        System.out.print("Sort time: " + (System.currentTimeMillis() - start));

        System.out.println();

        int[] numbersToBubbleSort = SupportedUtils.creatingRandomNumberArray();
        start = System.currentTimeMillis();
        BubbleSort.bubbleSort(numbersToBubbleSort);
        System.out.print("Sorted by bubbleSort: ");
        SupportedUtils.printArray(numbersToBubbleSort);
        System.out.print("Sort time: " + (System.currentTimeMillis() - start));

        System.out.println();

        int[] numbersToSelectSort = SupportedUtils.creatingRandomNumberArray();
        start = System.currentTimeMillis();
        SelectSort.selectSort(numbersToSelectSort);
        System.out.print("Sorted by selectSort: ");
        SupportedUtils.printArray(numbersToSelectSort);
        System.out.print("Sort time: " + (System.currentTimeMillis() - start));

        System.out.println();

        int[] numbersToInsertionSort = SupportedUtils.creatingRandomNumberArray();
        start = System.currentTimeMillis();
        InsertionSort.insertionSort(numbersToInsertionSort);
        System.out.print("Sorted by insertionSort: ");
        SupportedUtils.printArray(numbersToInsertionSort);
        System.out.print("Sort time: " + (System.currentTimeMillis() - start));

        System.out.println();
    }
}
