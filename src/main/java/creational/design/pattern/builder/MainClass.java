package creational.design.pattern.builder;

public class MainClass {
    public static void main(String args[]) {
        Employee employee = new Employee.Builder("badman", "badman007@gmail.com").build();
        System.out.print(employee.toString());
    }
}
