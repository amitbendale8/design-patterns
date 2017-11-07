package templatepattern;

public class App {
    public static void main(String args[]){
        int number[] = {1,4,2,5,6};
        Algorithm sortAlgorithm = new BubbleSort(number);
        sortAlgorithm.sort();
    }
}
