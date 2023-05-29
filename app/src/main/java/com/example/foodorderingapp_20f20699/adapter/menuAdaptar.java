package com.example.foodorderingapp_20f20699.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodorderingapp_20f20699.R;
import com.example.foodorderingapp_20f20699.dmen.MenuDmen;

import java.util.ArrayList;

public class menuAdaptar extends RecyclerView.Adapter<menuAdaptar.VirewHolder> {
    ArrayList<MenuDmen>MenuDomains;

    public menuAdaptar(ArrayList<MenuDmen>MenuDomains){
        this.MenuDomains=MenuDomains;
    }

    @Override
    public VirewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholdr_menu,parent,false);
        return new VirewHolder(inflate);
    }


    @Override
    public void onBindViewHolder(@NonNull VirewHolder holder, int position) {
holder.MenuName.setText(MenuDomains.get(position).getTitle());
String picUrl="";
switch (position){

    //here we link cat with the drawableResource
    case 0:{
        picUrl="Cat1";
        holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_backgrund1));
    break;
    }
    case 1:{
        picUrl="Cat2";
        holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_backgrund2));

        break;
    }
    case 2:{
        picUrl="Cat3";
        holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_backgrund3));
        break;
    }
    case 3:{
        picUrl="Cat4";
        holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_backgrund4));
        break;
    }
}
    int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());

    Glide.with(holder.itemView.getContext())
            .load(drawableResourceId)
            .into(holder.MenuPic);

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class VirewHolder extends RecyclerView.ViewHolder{

        TextView MenuName;
        ImageView MenuPic;
        ConstraintLayout mainLayout;
        public VirewHolder(@NonNull View itemView) {
            super(itemView);
//we created the new dawable resource and we wrote this code below to link MenuName and MenuPic to cat_backgrund.xml
            MenuName=itemView.findViewById(R.id.menuName);
            MenuPic=itemView.findViewById(R.id.menuPic);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
    }
}
