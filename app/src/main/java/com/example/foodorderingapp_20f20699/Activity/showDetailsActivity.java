package com.example.foodorderingapp_20f20699.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.foodorderingapp_20f20699.R;
import com.example.foodorderingapp_20f20699.dmen.FoodDmen;
import com.example.foodorderingapp_20f20699.helper.MangCart;


public class showDetailsActivity extends AppCompatActivity {
        // This is a declarations a privates variables named addtocart ,titletx,prictx,descrbtiontx and numordertx  of type TextView -->
        private TextView addtocartBT;
        private TextView titletx,prictx,descrbtiontx,numordertx;

    // This is a declarations a privates variables named plusBT,minusBT,picfood of type ImageView -->
        private ImageView plusBT,minusBT,picfood;
    // This is a declarations a privates variables named objet of type class FoodDmen  -->
        private FoodDmen objet;
            int numberOrder=1;
           private MangCart mangementCart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
        mangementCart=new MangCart (this);
        initView();
        getBundle();
    }
    //This code is related to loading and displaying images using the Glide library
    private void getBundle() {
        objet = (FoodDmen) getIntent().getSerializableExtra("object");
        int drawableResourceId = this.getResources().getIdentifier(objet.getPic(), "drawable", this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(picfood);


        titletx.setText(objet.getTitle());
        prictx.setText("$" + objet.getCost());
        descrbtiontx.setText(objet.getDescription());
        numordertx.setText(String.valueOf(numberOrder));


        plusBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOrder = numberOrder + 1;
                numordertx.setText(String.valueOf(numberOrder));

            }
        });



        minusBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numberOrder>1){
                    numberOrder=numberOrder-1;
            }
                numordertx.setText(String.valueOf(numberOrder));

            }
        });
//This code sets the OnClickListener of the addtocartBT TextView object to give it the click properties on that
// TextView object

        addtocartBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                objet.setNumberInCart(numberOrder);
                mangementCart.insrtFood(objet);

            }
        });
    }
//This code finds the view by id
    private void initView(){
        addtocartBT=findViewById(R.id.addBtn);
        titletx=findViewById(R.id.titletx);
        prictx=findViewById(R.id.prictx);
        descrbtiontx=findViewById(R.id.descrbtiontx);
        numordertx=findViewById(R.id.numOrderTx);
        plusBT=findViewById(R.id.plusBT);
        minusBT=findViewById(R.id.muinsBT);
        picfood=findViewById(R.id.picF);
    }
}