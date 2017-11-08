package builderpattern;

public class Person {
    private String name;
    private String emailAddress;
    private String address;
    private int age;
    private String university;

    public Person(Builder builder){
        this.name = builder.name;
        this.emailAddress = builder.emailAddress;
        this.address = builder.address;
        this.age = builder.age;
    }
    public static class Builder{
        private final String name;
        private final String emailAddress;
        private String address;
        private int age;
        private String university;

        public Builder(String name, String emailAddress){
            this.name = name;
            this.emailAddress = emailAddress;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setUniversity(String university){
            this.university = university;
            return this;
        }
        public Person build(){
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return this.name+" "+this.emailAddress;
    }
}
