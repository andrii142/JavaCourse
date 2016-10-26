package module10.questions;

public class Message extends BaseEntity {

    private long id;
    private String description;

    public Message(long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    long getId() {
        return 0;
    }
}
