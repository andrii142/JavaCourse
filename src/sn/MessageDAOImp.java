package sn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MessageDAOImp implements MessageDAO {
    static List<Message> msgs = new ArrayList<>();

    @Override
    public Message save(Message message) {
        msgs.add(message);
        return message;
    }

    @Override
    public List<Message> getAll() {
        return msgs;
    }

    @Override
    public void delete(Message message) {
        msgs.remove(message);
    }


    @Override
    public void setRead(long id) {
        msgs.replaceAll(new UnaryOperator<Message>() {
            @Override
            public Message apply(Message message) {
                if(message.getId() == id) {
                    message.setRead(true);
                }
                return message;
            }
        });
    }

    @Override
    public void setRead(Message msg) {
        msgs.replaceAll(new UnaryOperator<Message>() {
            @Override
            public Message apply(Message message) {
                if(message.equals(msg)) {
                    message.setRead(true);
                }
                return message;
            }
        });
    }
}
