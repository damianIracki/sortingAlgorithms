package algorithms;

public class BubbleSort {

    public static void bubbleSort(int[] array){
        algorithmBubbleSort(array);
    }

    private static void algorithmBubbleSort(int[] array){

        int n = array.length;
        int iterationQuantity = 0;
        boolean swapped = true;

        while(iterationQuantity < n - 1 && swapped) {
            swapped = false;
            for (int j = 0; j < n - 1 - iterationQuantity; j++) {
                if(array[j] > array[j + 1]){
                    SupportedUtils.swap(array, j, j + 1);
                    swapped = true;
                }
            }
            iterationQuantity++;
        }
    }
}
