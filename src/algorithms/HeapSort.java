package algorithms;

public class HeapSort {
    public static void heapSort(int[] numbers){
        algorithmHeapSort(numbers);
    }

    private static void algorithmHeapSort(int numbers[]){

        if(numbers == null || numbers.length ==0)
            return;

        int n = numbers.length;

        //budowa maksymalnego kopca
        for(int i = n / 2 - 1; i >= 0; i--){
            HeapSort.validateMaxHeap(numbers, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            swap(numbers, 0, i);
            --n;
            validateMaxHeap(numbers, n, 0);
        }
    }

    private static void validateMaxHeap(int[] numbers, int heapSize, int parentIndex){
        int maxValueIndex = parentIndex;
        int leftChildIndex = parentIndex * 2 + 1;
        int rightChildIndex = parentIndex * 2 + 2;

        if(leftChildIndex < heapSize && numbers[leftChildIndex] > numbers[maxValueIndex]){
            maxValueIndex = leftChildIndex;
        }
        if(rightChildIndex < heapSize && numbers[rightChildIndex] > numbers[maxValueIndex]){
            maxValueIndex = rightChildIndex;
        }
        if(maxValueIndex != parentIndex){
            HeapSort.swap(numbers, maxValueIndex, parentIndex);
            HeapSort.validateMaxHeap(numbers, heapSize, maxValueIndex);
        }
    }

    private static void swap(int[] numbers, int index1, int index2){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
