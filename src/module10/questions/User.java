package module10.questions;

import java.util.UUID;

public class User extends BaseEntity {

    private String name;
    private UUID uuid;
    private long id;

    public User(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }
}
