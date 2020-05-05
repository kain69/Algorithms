package SortingAlgorithms;

/**
 * Класс сортировки выбором
 */
public class SelectionSort extends Algorithm {

    @Override
    public void sorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            swap(array, i, minId);
        }
    }

    @Override
    public void print(int[] array) {
        System.out.print("Сортировка выбором: ");
        super.print(array);
    }
}
