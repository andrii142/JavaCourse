package module8;

import java.util.ArrayList;
import java.util.List;

public class HW<T> {
    List<T> list = new ArrayList<>();

    T delete(T t) {
        list.remove(t);
        return t;
    }


}
