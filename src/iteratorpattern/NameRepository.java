package iteratorpattern;

public class NameRepository {
    private String[] names={"amit","amift","amist"};

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
