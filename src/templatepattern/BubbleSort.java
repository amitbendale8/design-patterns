package templatepattern;



public class BubbleSort extends Algorithm {

    private int[] numbers;

    public BubbleSort(int[] numbers){
        this.numbers  = numbers;
    }
    @Override
    public void intialize() {
        System.out.println("Initialize bubble sort. ");
    }

    @Override
    public void sorting() {
        System.out.println("doing bubble sort");

    }

    @Override
    public void printResult() {
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
