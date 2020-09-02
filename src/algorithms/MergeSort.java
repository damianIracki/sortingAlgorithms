package algorithms;

public class MergeSort {

    private static int[] extraArray;

    private static void mergeSort(int[] array, int leftIndex, int rightIndex){
        if(leftIndex < rightIndex){
            int mid = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, mid);
            mergeSort(array, mid + 1, rightIndex);
            merge(array, leftIndex, mid, rightIndex);
        }
    }

    private static void merge(int[] array, int leftIndex, int midIndex, int rightIndex) {
        for(int i = leftIndex; i <= rightIndex; i++){
            extraArray[i] = array[i];
        }

        int finger1 = leftIndex;
        int finger2 = midIndex + 1;
        int current = leftIndex;

        while(finger1 <= midIndex && finger2 <= rightIndex){
            if(extraArray[finger1] <= extraArray[finger2]){
                array[current] = extraArray[finger1];
                finger1++;
            } else {
                array[current] = extraArray[finger2];
                finger2++;
            }
            current++;
        }
        while(finger1 <= midIndex){
            array[current] = extraArray[finger1];
            current++;
            finger1++;

        }
    }

    public static void sort(int[] array){
        extraArray = new int[array.length];
        mergeSort(array, 0, array.length - 1);
    }
}
