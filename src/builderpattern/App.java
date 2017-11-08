package builderpattern;

public class App {
    public static void main(String args[]){
        Person person = new Person.Builder("amit","amit@gmail.com").build();

        System.out.println(person);
    }
}
