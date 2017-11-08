package dataaccesspattern;

public class App {
    public static void main(String args[]){
        Database database = new Database();
        database.insert(new Person("Amit",27));
        database.insert(new Person("xyz",45));

        for(Person person: database.getPeople()){
            System.out.println(person);
        }
    }
}
