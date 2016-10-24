package module10.practice;

import java.util.Map;

public class PersonController {
  
  public String save(Map<String, String> requestParams) throws Exception {
    if(!requestParams.containsKey("firstName")) {
      throw new Exception("Отсутствует обязательный параметр \"Имя\"");
    }
/*
    if(!requestParams.containsKey("lastName")) {
      throw new Exception("Отсутствует обязательный параметр \"Фамилия\"");
    }
*/    
    if(!requestParams.containsKey("email")) {
      throw new Exception("Отсутствует обязательный параметр \"Email\"");
    }
    final String firstName = requestParams.get("firstName");
    final String email = requestParams.get("email");
//    final String lastName = requestParams.get("lastName");
    
    // рекомендую не использовать тернарники, а использовать подобную конструкцию
    final String lastName;
    if (requestParams.get("lastName") != null) {
      lastName = requestParams.get("lastName");
    } else {
      lastName = "";
    }

    Person person = new Person(firstName, lastName, email);

    PersonDao personDao = new PersonDaoImpl();
    personDao.save(person);
    return person.toString();
  }

}
