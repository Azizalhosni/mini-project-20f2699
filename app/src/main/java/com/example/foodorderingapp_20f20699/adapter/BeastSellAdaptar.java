package com.example.foodorderingapp_20f20699.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodorderingapp_20f20699.Activity.showDetailsActivity;
import com.example.foodorderingapp_20f20699.R;
import com.example.foodorderingapp_20f20699.dmen.FoodDmen;

import java.util.ArrayList;

public class BeastSellAdaptar extends RecyclerView.Adapter<BeastSellAdaptar.VirewHolder> {
    ArrayList<FoodDmen> beastFood;

    //BeastSellAdaptar is a Java class that extends from the RecyclerView.Adapter class.
    // Used to make an adapter to fill data into the RecyclerView on the main page

    public BeastSellAdaptar(ArrayList<FoodDmen>beastFood){
        this.beastFood =beastFood;
    }


    @Override
    public VirewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_beastsll,parent,false);
        return new VirewHolder(inflate);
    }


    @Override


    public void onBindViewHolder(@NonNull BeastSellAdaptar. VirewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.title.setText(beastFood.get(position).getTitle());
        holder.cost.setText(String.valueOf(beastFood.get(position).getCost()));


    //here we link cat with the drawableResource

    int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(beastFood.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());

    Glide.with(holder.itemView.getContext())
            .load(drawableResourceId)
            .into(holder.pic);


    holder.addBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(holder.itemView.getContext(), showDetailsActivity.class);
            intent.putExtra("object",beastFood.get(position));
            holder.itemView.getContext().startActivity(intent);

        }
    });


    }


    @Override
    public int getItemCount() { return beastFood.size(); }

    public class VirewHolder extends RecyclerView.ViewHolder{

        TextView title,cost;
        ImageView pic;
       ImageView addBtn;
        public VirewHolder(@NonNull View itemView) {
            super(itemView);
//we created the new dawable resource and we wrote this code below to link MenuName and MenuPic to cat_backgrund.xml
            title=itemView.findViewById(R.id.title);
            cost=itemView.findViewById(R.id.cost);
            pic=itemView.findViewById(R.id.picF);
            addBtn=itemView.findViewById(R.id.addBtn);
        }
    }
}
