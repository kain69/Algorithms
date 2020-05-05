package SortingAlgorithms;

/**
 * Класс сортировки слиянием
 */
public class MergeSort extends Algorithm {

    @Override
    public void sorting(int[] array) {
        int left = 0;
        int right = array.length - 1;
        mergeSorting(array, left, right);
    }

    private void mergeSorting(int[] array, int left, int right) {
        if (right <= left)
            return;
        int mid = (left + right) / 2;
        mergeSorting(array, left, mid);
        mergeSorting(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
        // создаем временные подмассивы
        int[] leftArray = new int[lengthLeft];
        int[] rightArray = new int[lengthRight];
        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];
        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;
        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    @Override
    public void print(int[] array) {
        System.out.print("Сортировка слиянием: ");
        super.print(array);
    }
}
