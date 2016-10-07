package module7.questions;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorExample {
    public static void main(String[] args) {
        Set<Message> messageSet = new TreeSet<>();

        messageSet.add(new Message("Hello, it's me", "mobile"));
        messageSet.add(new Message("How are you?", "PC"));
        messageSet.add(new Message("Fine! And you? ", "mobile"));


        Iterator<Message> iterator = messageSet.iterator();
        //example - print all messages
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getMsg());
        }


        //example - delete if contains
        Iterator<Message> iterator1 = messageSet.iterator();
        while (iterator1.hasNext()) {
            Message msg = iterator1.next();
            if (msg.getMsg().contains("test")) iterator1.remove();
        }

        System.out.println(messageSet);

    }
}
