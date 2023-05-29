package com.example.foodorderingapp_20f20699.helper;

import android.content.Context;
import android.widget.Toast;

import com.example.foodorderingapp_20f20699.dmen.FoodDmen;

import java.util.ArrayList;

public class MangCart {
    private Context context;
    private TinyDB tinyDB;

    public MangCart(Context context) {
        this.context = context;
        this.tinyDB=new TinyDB(context);
    }


    public void insrtFood(FoodDmen item){

        ArrayList<FoodDmen> listFood= getListCart();
        boolean existAlready=false;
        int b=0;
        for (int i=0;i<listFood.size();i++){
            if (listFood.get(i).getTitle().equals(item.getTitle())){
                existAlready=true;
                b=i;
                break;
            }

        }
        if (existAlready) {
            listFood.get(b).setNumberInCart(item.getNumberInCart());
        }else {
            listFood.add(item);
        }
        tinyDB.putListObject("CartList",listFood);
        Toast.makeText(context, "Added to cart", Toast.LENGTH_SHORT).show();

    }
    public ArrayList<FoodDmen> getListCart(){
        return tinyDB.getListObject("CartList");
    }

}



