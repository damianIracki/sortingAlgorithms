package algorithms;

public class InsertionSort {

    public static void insertionSort(int[] array){
        algorithmInsertionSort(array);
    }

    private static void algorithmInsertionSort(int[] array){
        int n = array.length;
        int current;
        int otherIndex;
        for(int i = 1; i < n; i++){
            current = array[i];
            otherIndex = i;
            while(otherIndex > 0 && current < array[otherIndex - 1]){
                array[otherIndex] = array[otherIndex - 1];
                otherIndex--;
            }
            array[otherIndex] = current;
        }
    }
}
