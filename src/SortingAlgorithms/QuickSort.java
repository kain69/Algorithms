package SortingAlgorithms;

/**
 * Класс быстрой сортировки
 */
public class QuickSort extends Algorithm {

    @Override
    public void sorting(int[] array) {
        int begin = 0;
        int end = array.length - 1;
        quickSort(array, begin, end);
    }

    private void quickSort(int[] array, int begin, int end) {
        if (end <= begin)
            return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }

    private int partition(int[] array, int begin, int end) {
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[end]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[end];
        array[end] = array[counter];
        array[counter] = temp;
        return counter;
    }

    @Override
    public void print(int[] array) {
        System.out.print("Быстрая сортировка: ");
        super.print(array);
    }
}
