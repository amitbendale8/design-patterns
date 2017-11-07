package templatepattern;

public abstract  class Algorithm {
    public abstract  void intialize();
    public abstract void sorting();
    public abstract  void printResult();

    public void sort(){
        intialize();
        sorting();
        printResult();
    }
}
