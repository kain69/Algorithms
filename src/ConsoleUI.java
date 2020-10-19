import SortingAlgorithms.Algorithm;
import java.util.Arrays;

/**
 * Класс обработчик
 */
public class ConsoleUI {

    private Algorithm algorithm;

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sorting(int[] array){
        algorithm.sorting(array);
    }

    public void print(int[] array){
        String name = algorithm.getName();
        System.out.print(name + ": ");
        System.out.println(Arrays.toString(array));
    }
}
