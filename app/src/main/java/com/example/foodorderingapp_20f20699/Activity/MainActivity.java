package com.example.foodorderingapp_20f20699.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorderingapp_20f20699.R;
import com.example.foodorderingapp_20f20699.adapter.BeastSellAdaptar;
import com.example.foodorderingapp_20f20699.adapter.menuAdaptar;
import com.example.foodorderingapp_20f20699.dmen.FoodDmen;
import com.example.foodorderingapp_20f20699.dmen.MenuDmen;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
// Here we make tow recycler view recyclerViewMenuList and recyclerViewBeastSellerList
    // and we make also tow adapter to adapter the menu list
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewMenuList,recyclerViewBeastSellerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);


        recyclerViewMenuList();
        RecyclerViewBeastSeller();

    }

    private void recyclerViewMenuList()

    {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewMenuList=findViewById(R.id.recyclerView);
        recyclerViewMenuList.setLayoutManager(linearLayoutManager);

//array list for menu domin
        ArrayList<MenuDmen> menu=new ArrayList<>();
        menu.add(new MenuDmen("piza","cat1"));
        menu.add(new MenuDmen("burget","cat2"));
        menu.add(new MenuDmen("drink","cat3"));
        menu.add(new MenuDmen("donut","cat4"));

        adapter=new menuAdaptar(menu);
        recyclerViewMenuList.setAdapter(adapter);
    }
    //Here we called recyclerView2
    private void RecyclerViewBeastSeller(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        recyclerViewBeastSellerList=findViewById(R.id.recyclerView2);
        recyclerViewBeastSellerList.setLayoutManager(linearLayoutManager);

//Here we have added meal menus such as pizza, burgers and vegetable pizza

        ArrayList<FoodDmen>foodList=new ArrayList<>();
        foodList.add(new FoodDmen("pepperoni pizza","pizza1","slices pepperoni,Mozzerella cheese,fresh oregano,pizza sauce",5.3));
        foodList.add(new FoodDmen("burger","burger","Beef burger, vegetables, fries, potato slices, BBQ sauce",1.9));
        foodList.add(new FoodDmen("Vegetable pizza", "pizza2", "olive oil, vegetable oil, vegetables with mushrooms, vegetable sauce",4.5));

        adapter2=new BeastSellAdaptar(foodList);
        recyclerViewBeastSellerList.setAdapter(adapter2);



         }

}