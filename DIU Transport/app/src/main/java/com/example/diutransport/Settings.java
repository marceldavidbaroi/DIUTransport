package com.example.diutransport;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_settings);
//navigation bar buttons
        TextView home = findViewById(R.id.home_btn_tv);
        TextView nearMe = findViewById(R.id.nearMe_btn_tv);
        TextView eTicket = findViewById(R.id.eTicket_btn_tv);
        TextView booking = findViewById(R.id.preBook_btn_tv);
        TextView settings = findViewById(R.id.settings_btn_tv);

        //activity button
        Button Account = findViewById(R.id.Account_btn);
        Button General = findViewById(R.id.General_btn);
        Button About = findViewById(R.id.About_btn);
        Button Update = findViewById(R.id.Update_btn);
        Button Submit = findViewById(R.id.Submit);
        Button Logout = findViewById(R.id.Logout);


        RatingBar rating = findViewById(R.id.Rating_bar);



//submit button
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting value of rating
               String value = String.valueOf(rating.getRating());
                    Toast.makeText(Settings.this,"Thanks for your "+ value +" star rating",Toast.LENGTH_LONG).show();

            }
        });
//logout button
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.this, login.class);
                startActivity(intent);


            }
        });

        //update button
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.this, Update.class);
                startActivity(intent);
            }
        });

        //Navigation Buttons


        //Dashboard me button
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this,Dash_board.class);
                startActivity(intent);
            }
        });
        //Near me button
        nearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this,NearME.class);
                startActivity(intent);
            }
        });


        //Eticket button
        eTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this,Eticket.class);
                startActivity(intent);
            }
        });
        //settings button
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Settings.this,Settings.class);
                startActivity(intent);
            }
        });

        //Booking button
        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Settings.this,Booking.class);
                startActivity(intent);
            }
        });


    }
}