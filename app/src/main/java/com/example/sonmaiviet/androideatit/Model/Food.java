package com.example.sonmaiviet.androideatit.Model;

public class Food {
    private String Description, Discount, Image, Item, MenuId, Price;

    public Food() {
    }

    public Food(String description, String discount, String image, String item, String menuId, String price) {
        Description = description;
        Discount = discount;
        Image = image;
        Item = item;
        MenuId = menuId;
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
