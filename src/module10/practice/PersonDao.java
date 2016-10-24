package module10.practice;

public interface PersonDao {

  Person save(Person person);
  
  Person findByEmail(String email);

}
