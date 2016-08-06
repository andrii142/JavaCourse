package module3.adsWebSite;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;

    private String phone;

    private List<Message> messages;

    public User(String firstName, List<Message> messages, String lastName, String phone) {
        this.firstName = firstName;
        this.messages = messages;
        this.lastName = lastName;
        this.phone = phone;
    }

    public int inboxMessagesCount() {
        return messages.size();
    }

    public int inboxMessagesCountFromUser(User user) {
       //TODO LIVE CODING

        return 0;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
