package module10.questions;

import sn.User;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T extends BaseEntity> implements AbstractDAO<T> {

    List<T> list = new ArrayList<>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public T findById(long id) {
        for (T item : list) {
            if (item.getId() == id)
                return item;
        }
        return null;
    }
}
