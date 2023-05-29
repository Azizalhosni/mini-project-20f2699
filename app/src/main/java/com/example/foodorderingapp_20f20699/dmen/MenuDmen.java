package com.example.foodorderingapp_20f20699.dmen;

import java.util.Locale;

public class MenuDmen {
    //-- this code bellow are the declares a private instance variable called "title,pic" of type String -->
    private String title;
    private String pic;

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
    //  This constructor allows a class to be instantiated by ( MenuDmen) by providing values to its instance variables ( title, pic) when the object is created.

    public MenuDmen(String title, String pic)
    {
        this.title=title;
        this.pic=pic;

    }

}
