package com.example.diutransport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class NearME extends AppCompatActivity {

    String imB1;
    String imB2;
    String imB3;
    String imB4;
    String imB5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();



        setContentView(R.layout.activity_near_me);

        //navigation bar buttons
        TextView home = findViewById(R.id.home_btn_tv);
        TextView nearMe = findViewById(R.id.nearMe_btn_tv);
        TextView eTicket = findViewById(R.id.eTicket_btn_tv);
        TextView booking = findViewById(R.id.preBook_btn_tv);
        TextView settings = findViewById(R.id.settings_btn_tv);




        Button button_B1 = findViewById(R.id.btn_B1);
        Button button_B2 = findViewById(R.id.btn_B2);
        Button button_B3 = findViewById(R.id.btn_B3);
        Button button_B4 = findViewById(R.id.btn_B4);
        Button button_B5 = findViewById(R.id.btn_B5);



        //Navigation Buttons


        //Dashboard me button
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NearME.this,Dash_board.class);
                startActivity(intent);
            }
        });
        //Near me button
        nearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NearME.this,NearME.class);
                startActivity(intent);
            }
        });


        //Eticket button
        eTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NearME.this,Eticket.class);
                startActivity(intent);
            }
        });
        //settings button
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NearME.this,Settings.class);
                startActivity(intent);
            }
        });

        //Booking button
        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NearME.this,Booking.class);
                startActivity(intent);
            }
        });





        //main activity

        button_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imB1 = Update.getActivityInstance().UgetDataB1();
                gotoUrl(imB1);

            }
        });
        button_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imB2 = Update.getActivityInstance().UgetDataB2();
                gotoUrl(imB2);

            }
        });
        button_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imB3 = Update.getActivityInstance().UgetDataB3();
                gotoUrl(imB3);

            }
        });
        button_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imB4 = Update.getActivityInstance().UgetDataB4();
                gotoUrl(imB4);

            }
        });
        button_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imB5 = Update.getActivityInstance().UgetDataB5();
                gotoUrl(imB5);

            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}