package algorithms;

public class QuickSort {

    public static void sort(int array[]){
        if(array == null && array.length == 0){
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int leftIndex, int rightIndex) {
        //sprawdzenie czy tablica jest jednoelementowa
        if(leftIndex >= rightIndex){
            return;
        }

        int border = partitionArray(array, leftIndex, rightIndex);

        if(border - leftIndex < rightIndex - border) {
            quickSort(array, leftIndex, border - 1);
            quickSort(array, border + 1, rightIndex);
        } else {
            quickSort(array, border + 1, rightIndex);
            quickSort(array, leftIndex, border - 1);
        }
    }

    private static int partitionArray(int[] array, int leftIndex, int rightIndex){
        int pivot = choosePivot(array, leftIndex, rightIndex);
        int border = leftIndex - 1;
        int i = leftIndex;

        while(i < rightIndex){
            if(array[i] < pivot){
                border++;
                if(border != i){
                    SupportedUtils.swap(array, i, border);
                }
            }
            i++;
        }
        border++;
        if(border != rightIndex){
            SupportedUtils.swap(array, border, rightIndex);
        }
        return border;
    }

    private static int choosePivot(int[] array, int leftIndex, int rightIndex) {
        int mid = leftIndex + (rightIndex - leftIndex) / 2;
        int pivot = array[mid];
        SupportedUtils.swap(array, mid, rightIndex);
        return pivot;
    }
}
