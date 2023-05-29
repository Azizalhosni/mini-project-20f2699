package com.example.foodorderingapp_20f20699.dmen;

import java.io.Serializable;

public class FoodDmen implements Serializable {
   //-- this code bellow are the declares a private instance variable called "title,pic,description" of type String -->
    private String title;
    private String pic;
    private String description;
    //-- this code bellow are the declares a private instance variable called "cost" of type double -->

    private double cost;

    //-- this code bellow are the declares a private instance variable called "numberInCart" of type int -->
    private int numberInCart;

    public FoodDmen(String title, String pic, String description, double cost){
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.cost = cost;
      //  This constructor allows a class to be instantiated by ( FoodDmen) by providing values to its instance variables (title,pic,description,cost) when the object is created.
    }

    public FoodDmen(String title, String pic, String description, double cost, int numberInCart) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.cost = cost;
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
