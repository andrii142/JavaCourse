package module4.webinar.interfaces;

import module4.webinar.abstractclassesandmethods.DeveloperEmployee;

public class ManagerDbService implements DBService {
    @Override
    public void save(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee[] getAllDevelopers() {
        return new DeveloperEmployee[0];
    }
}
