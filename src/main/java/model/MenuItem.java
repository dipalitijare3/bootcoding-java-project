package model;

public class MenuItem {
    int id;
    String menuName;
    boolean isVeg;
    double price;
    String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }



}
