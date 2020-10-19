package SortingAlgorithms;

/**
 * Класс пузырьковой сортировки
 */
public class BubbleSort extends Algorithm {

    public BubbleSort(){
        super.setName("Пузырьковая сортировка");
    }

    @Override
    public void sorting(int[] array) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] < array[i - 1]) {
                    isSorted = false;
                    swap(array, i, i - 1);
                }
            }
        }
    }
}
