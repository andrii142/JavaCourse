package module10.practice;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
  
  private static List<Person> persons = new ArrayList<>();

  @Override
  public Person save(Person person) {
    persons.add(person);
    return person;
  }

  @Override
  public Person findByEmail(String email) {
    for (Person person : persons) {
      if (person.getEmail().equals(email)) {
        return person;
      }
    }
    return null;
  }

  @Override
  public List<Person> get() {
    return persons;
  }
}
