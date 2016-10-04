package module7.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MessageSort {


    public static void main(String[] args) {
        Set<Message> messageSet = new TreeSet<>();

        messageSet.add(new Message("Hello, it's me", "mobile"));
        messageSet.add(new Message("How are you?", "PC"));
        messageSet.add(new Message("Fine! And you? ", "mobile"));


        System.out.println(messageSet);


        //arrays sort example
        Message[] msgs = new Message[2];
        msgs[0] = new Message("Hello, it's me ", "mobile");
        msgs[1] = new Message("How are you?  ", "PC");

        SortMessages sortMessages = new SortMessages();
        Arrays.sort(msgs, sortMessages);

        Comparator<Message> comparator = new Comparator<Message>() {
            @Override
            public int compare(Message m1, Message m2) {
                return countSpaces(m1) - countSpaces(m2);
            }
        };

        Arrays.sort(msgs, comparator);

        System.out.println(Arrays.deepToString(msgs));

    }

    private static int countSpaces(Message m) {
        int counter = 0;
        for (String item : m.getMsg().split("")) {
            if (item.equals(" ")) counter++;
        }

        return counter;
    }
}
