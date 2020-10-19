package SortingAlgorithms;

public abstract class Algorithm {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void sorting(int[] array);

    protected void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
