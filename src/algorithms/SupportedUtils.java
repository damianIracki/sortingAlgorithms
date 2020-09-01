package algorithms;

import java.util.Random;

public class SupportedUtils {

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int[] creatingRandomNumberArray(){
        Random random = new Random();
        int[] arrayWithRandomNumber = new int[1000];
        for(int i = 0; i < arrayWithRandomNumber.length; i++){
            arrayWithRandomNumber[i] = random.nextInt(100);
        }
        return arrayWithRandomNumber;
    }

    public static void printArray(int[] array){
        for (Object object : array) {
            System.out.print(object.toString() + ", ");
        }

    }
}