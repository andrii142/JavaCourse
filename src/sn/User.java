package sn;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int age;
    private Date birthDate;
    private HashSet<User> friends;

    private boolean isActive;

    private Date dateRegistered;
    private Date dateLastActive;

    public User(String firstName, String city) {
        this.id = (int) Math.random() * 100;
        this.firstName = firstName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", friends=" + friends +
                ", isActive=" + isActive +
                ", dateRegistered=" + dateRegistered +
                ", dateLastActive=" + dateLastActive +
                '}';
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
}
