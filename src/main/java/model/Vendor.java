package model;

public class Vendor {
    int id;
    String name;
    String address;
    long contact;
    boolean isVeg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContact() {
        return contact;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }


}
