package sn;

import module9.questions.BaseEntity;

import java.util.*;

public class User implements BaseEntity<User>{
    private long id;
    private String firstName;
    private String lastName;
    private String password;
    private String city;
    private int age;
    private Date birthDate;
    private HashSet<User> friends;

    private List<Message> messages;

    private boolean isActive;
    private boolean isLoggedIn;

    private Date dateRegistered;
    private Date dateLastActive;

    public User(String firstName, String city) {
        this.id = (int) Math.random() * 100;
        this.firstName = firstName;
        this.city = city;

        this.friends = new HashSet<>();
        this.messages = new ArrayList<>();
    }


    @Override
    public User getByid(long id) {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", age=").append(age);
        sb.append(", friends=").append(friends.size());
        sb.append(", messages=").append(messages.size());
        sb.append('}');
        return sb.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public HashSet<User> getFriends() {
        return friends;
    }

    public void setFriends(HashSet<User> friends) {
        this.friends = friends;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Date getDateLastActive() {
        return dateLastActive;
    }

    public void setDateLastActive(Date dateLastActive) {
        this.dateLastActive = dateLastActive;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
