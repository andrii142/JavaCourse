package module7.questions;

import java.util.Comparator;

public class SortMessages implements Comparator<Message> {
    @Override
    public int compare(Message o1, Message o2) {
        return o1.getDeviceName().compareTo(o2.getDeviceName());
    }
}
