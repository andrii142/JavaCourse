package module4.practice.dao;

public interface DAO {
    Object save(Object object);

    Object update(Object object);

    boolean delete(Object object);

    Object find(long id);
}
