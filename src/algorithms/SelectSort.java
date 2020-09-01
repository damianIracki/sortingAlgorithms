package algorithms;

public class SelectSort {

    public static void selectSort(int[] array){
        algorithmSelectSort(array);
    }

    private static void algorithmSelectSort(int[] array){

        int n = array.length;
        int minIndex;

        for(int i = 0; i < n - 1; i++){
            minIndex = i;
            for(int j = i + 1; j < n; j++){
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                SupportedUtils.swap(array, minIndex, i);
            }
        }
    }
}
