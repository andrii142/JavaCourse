package sn;

import java.util.List;

public interface MessageDAO {
    Message save(Message message);

    List<Message> getAll();

    void delete(Message message);

    void setRead(long id);

    void setRead(Message message);
}
