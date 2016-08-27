package module3.adsWebSite;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;

    private String phone;

    private Message[] messages = new Message[5];

    public User(String firstName, Message[] messages, String lastName, String phone) {
        this.firstName = firstName;
        this.messages = messages;
        this.lastName = lastName;
        this.phone = phone;
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
}
