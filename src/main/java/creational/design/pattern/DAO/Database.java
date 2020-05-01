package creational.design.pattern.DAO;

import java.util.ArrayList;
import java.util.List;

public class Database implements PersonDAO {

    //to store the values in the database
    private List<Person> people;

    public Database() {
        this.people = new ArrayList<Person>();
    }

    @Override
    public void insert(Person person) {
        people.add(person);
    }

    @Override
    public void remove(Person person) {
        people.remove(person);
    }

    @Override
    public List<Person> getPeople() {
        return this.people;
    }
}
