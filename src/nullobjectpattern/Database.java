package nullobjectpattern;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> customerNames;

    public Database(){
        this.customerNames = new ArrayList<>();
        this.customerNames.add("asdf");
        this.customerNames.add("se3fs");
        this.customerNames.add("amit");
    }

    public boolean existCustomer(String name){
        return this.customerNames.contains(name);

    }
}
