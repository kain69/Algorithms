import SortingAlgorithms.*;

public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        int[] array4 = new int[10];
        int[] array5 = new int[10];
        int[] array6 = new int[10];

        for (int i = 0; i < 10 ; i++) {
            array1[i] = (int) ((Math.random() * 20) - 10);
            array2[i] = (int) ((Math.random() * 20) - 10);
            array3[i] = (int) ((Math.random() * 20) - 10);
            array4[i] = (int) ((Math.random() * 20) - 10);
            array5[i] = (int) ((Math.random() * 20) - 10);
            array6[i] = (int) ((Math.random() * 20) - 10);
        }

        ConsoleUI consoleUI = new ConsoleUI();

        consoleUI.setAlgorithm(new BubbleSort());
        consoleUI.print(array1);
        consoleUI.sorting(array1);
        consoleUI.print(array1);
        System.out.println();

        consoleUI.setAlgorithm(new InsertionSort());
        consoleUI.print(array2);
        consoleUI.sorting(array2);
        consoleUI.print(array2);
        System.out.println();

        consoleUI.setAlgorithm(new SelectionSort());
        consoleUI.print(array3);
        consoleUI.sorting(array3);
        consoleUI.print(array3);
        System.out.println();

        consoleUI.setAlgorithm(new HeapSort());
        consoleUI.print(array4);
        consoleUI.sorting(array4);
        consoleUI.print(array4);
        System.out.println();

        consoleUI.setAlgorithm(new MergeSort());
        consoleUI.print(array5);
        consoleUI.sorting(array5);
        consoleUI.print(array5);
        System.out.println();

        consoleUI.setAlgorithm(new QuickSort());
        consoleUI.print(array6);
        consoleUI.sorting(array6);
        consoleUI.print(array6);
        System.out.println();
    }
}
