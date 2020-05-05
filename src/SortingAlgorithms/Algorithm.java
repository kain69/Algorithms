package SortingAlgorithms;

import java.util.Arrays;

public abstract class Algorithm {

    public abstract void sorting(int[] array);

    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
