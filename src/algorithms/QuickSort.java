package algorithms;

public class QuickSort {

    private static void algorithmQuickSort(int numbers[], int leftIndex, int rightIndex){
        int i, j, pivot, temp;

        i = leftIndex;
        j = rightIndex;
        pivot = numbers[(leftIndex + rightIndex) / 2];

        do{
            while (numbers[i] < pivot){
                i++;
            }
            while (pivot < numbers[j]){
                j--;
            }

            if(i <= j){
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
            if(leftIndex < j)
                algorithmQuickSort(numbers, leftIndex, j);
            if(i < rightIndex)
                algorithmQuickSort(numbers, i, rightIndex);
    }

    public static void quickSort(int numbers[]){
        algorithmQuickSort(numbers, 0, numbers.length - 1);
    }
}
