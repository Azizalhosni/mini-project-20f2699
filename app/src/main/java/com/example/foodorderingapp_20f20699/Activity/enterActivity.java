package com.example.foodorderingapp_20f20699.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodorderingapp_20f20699.R;

public class enterActivity extends AppCompatActivity {
private ConstraintLayout Strat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entr);

        Strat=findViewById(R.id.constraintLayout );
        Strat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(enterActivity.this, MainActivity.class));
            }
        });


    }
}