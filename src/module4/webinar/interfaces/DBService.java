package module4.webinar.interfaces;

import module4.webinar.abstractclassesandmethods.DeveloperEmployee;

public interface DBService {
    //void test();
    //void method(int a, int b, String name);
    //
    //

    void save(DeveloperEmployee employee);

    DeveloperEmployee get(long id);

    void update(DeveloperEmployee employee);

    DeveloperEmployee[] getAllDevelopers();
}
