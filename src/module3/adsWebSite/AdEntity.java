package module3.adsWebSite;

import java.sql.Date;

public class AdEntity {
    private int price;
    private String city;
    private String currency;
    private Date dateCreated;
    private boolean isActive;
    private int rating;

    private User user;

    private void increaseRating(int delta) {
        rating += delta;
    }

    private void decreaseRating(int delta) {
        rating -= delta;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getCity() {
        return city;
    }

    public String getCurrency() {
        return currency;
    }

    public int getPrice() {
        return price;
    }

    public User getUser() {
        return user;
    }
}
