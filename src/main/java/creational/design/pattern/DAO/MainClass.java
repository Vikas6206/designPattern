package creational.design.pattern.DAO;

import java.util.List;

public class MainClass {
    public static void main(String args[]){
        Database database = new Database();
        Person modifyPerson=new Person("A",27);
        database.insert(new Person("VIkas",29));
        database.insert(new Person("B",28));
        database.insert(modifyPerson);
        database.insert(new Person("D",26));

        List<Person> listOfPeople = database.getPeople();
        listOfPeople.forEach(person -> System.out.println(person));

        database.remove(modifyPerson);
        System.out.print("After removing "+modifyPerson+" the list of perpole in db is\n");
        database.getPeople().forEach(person -> System.out.println(person));
    }
}
