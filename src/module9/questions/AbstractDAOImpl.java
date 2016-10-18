package module9.questions;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    List<T> list = new ArrayList<>();



    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

}
