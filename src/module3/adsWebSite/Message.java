package module3.adsWebSite;

import java.util.Date;

public class Message {
    private Date dateSent;
    private User fromUser;
    private User toUser;
    private String description;
    private boolean isRead;

    private void changeRecipient(User user) {
        if (!isRead)
            toUser = user;
    }

    private int setDescrSize() {
        return description.length();
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }
}
