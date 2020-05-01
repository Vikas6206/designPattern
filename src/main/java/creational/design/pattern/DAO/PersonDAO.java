package creational.design.pattern.DAO;

import java.util.List;

/**
 * Operation related to the the person
 */
public interface PersonDAO {
    public void insert(Person person);
    public void remove(Person person);
    public List<Person> getPeople();
}
