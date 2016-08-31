package module3.questions;

import java.util.Date;

public class User {
     private String[] phones;

     private int ID;
    //

    private Date date;

    public String[] getPhones() {
        if(phones.length != 0)
        return phones;
        //logic
        else return null;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date date1 = new Date();
        this.date = date;
    }
}
