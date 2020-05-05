import SortingAlgorithms.Algorithm;

/**
 * Класс обработчик
 */
public class ConsoleUI {
    private Algorithm algorithm;

    public Algorithm getAlgorithm() {
        return algorithm;
    }
    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sorting(int[] array){
        algorithm.sorting(array);
    }
    public void print(int[] array){
        algorithm.print(array);
    }
}
