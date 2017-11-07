package templatepattern;

public class InsertionSort extends Algorithm {

    private int[] numbers;

    public InsertionSort(int[] numbers){
        this.numbers  = numbers;
    }
    @Override
    public void intialize() {
        System.out.println("Initialize insertion sort. ");
    }

    @Override
    public void sorting() {
        System.out.println("doing insertion sort");

    }

    @Override
    public void printResult() {
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }


}
