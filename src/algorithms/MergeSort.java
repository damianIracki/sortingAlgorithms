package algorithms;

public class MergeSort {

    private static void algorithmMergeSort(int[] numbers, int high){
        if(high < 2){
            return;
        }

        int mid = high / 2;
        int[] left = new int[mid];
        int[] right = new int [high - mid];

        for(int i = 0; i < mid; i++){
            left[i] = numbers[i];
        }

        for(int i = mid; i < high; i++){
            right[i - mid] = numbers[i];
        }

        algorithmMergeSort(left, mid);
        algorithmMergeSort(right,high - mid);

        merge(numbers, left, right, mid, high - mid);
    }

    private static void merge( int[] numbers, int[] left, int[] right, int leftIndex, int rightIndex){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftIndex && j < rightIndex) {
            if (left[i] <= right[j]) {
                numbers[k++] = left[i++];
            } else {
                numbers[k++] = right[j++];
            }
        }
        while (i < leftIndex){
            numbers[k++] = left[i++];
        }
        while (j < rightIndex){
            numbers[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] numbers){
        algorithmMergeSort(numbers, numbers.length);
    }
}
