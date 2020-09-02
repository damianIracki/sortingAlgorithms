package algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class ShellSort {

    public  static  void shellSort(int[] array){
        sort(array, ShellSort::shellDistance);
    }

    private static void sort(int[] array, Function<Integer, Integer[]> distanceGenerator){
        int n = array.length;
        int iterationValue = 1;
        Integer[] distances = distanceGenerator.apply(n);
        int distance = distances[distances.length - iterationValue];
        int current;
        int otherIndex;

        while (distance >= 1){
            for(int i = distance; i < n; i++){
                current = array[i];
                otherIndex = i;
                while (otherIndex >= distance && current <= array[otherIndex - 1]){
                    array[otherIndex] = array[otherIndex - distance];
                    otherIndex -= distance;
                }
                array[otherIndex] = current;
            }
            distance = distances[distances.length - ++iterationValue];
        }
    }

    private static Integer[] shellDistance(int numberOfElements){
        ArrayList<Integer> distances = new ArrayList<>();
        int iterationValue = 1;
        int generated;
        do{
            generated = numberOfElements / (int) Math.pow(2, iterationValue);
            distances.add(generated);
            iterationValue++;
        } while (generated > 0);
        Collections.reverse(distances);
        return distances.toArray(new Integer[distances.size()]);
    }


}
