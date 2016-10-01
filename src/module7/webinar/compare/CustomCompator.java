package module7.webinar.compare;

import module7.webinar.User;

import java.util.Comparator;

public class CustomCompator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        // - 1 if o1 < o2
        // - 1 if o1 = o2
        //  1 if o1 > o2
                return o2.getAge() - o1.getAge();
    }


}
