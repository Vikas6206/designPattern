package creational.design.pattern.builder;

public class Employee {
    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private String address;

    public Employee(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.email=builder.email;
        this.address=builder.address;
    }

    public static class Builder {
        //once he object is build it can't be changed
        private final String name;
        private final String email;

        //optional
        private String address;
        private int age;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address){
            this.address=address;
            return this;
        }

        public Builder setAge(int age){
            this.age=age;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

    }
}
