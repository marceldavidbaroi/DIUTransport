package com.example.diutransport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Eticket extends AppCompatActivity {

    String BT;
    String FROM;
    String TO;
    String TIME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_eticket);


        //navigation bar buttons
        TextView home = findViewById(R.id.home_btn_tv);
        TextView nearMe = findViewById(R.id.nearMe_btn_tv);
        TextView eTicket = findViewById(R.id.eTicket_btn_tv);
        TextView booking = findViewById(R.id.preBook_btn_tv);
        TextView settings = findViewById(R.id.settings_btn_tv);


    //page element
        TextView BusType = findViewById(R.id.BusTypeValue_tv);
        TextView desFrom = findViewById(R.id.destinFromValue_tv);
        TextView desTo = findViewById(R.id.destinToValue_tv);
        TextView desTime = findViewById(R.id.depTimeValue_tv);


         BT = Booking.getActivityInstance().BookinggetDataBusType();
        BusType.setText(BT);
         FROM = Booking.getActivityInstance().BookinggetDataFrom();
        desFrom.setText(FROM);
         TO = Booking.getActivityInstance().BookinggetDataTo();
        desTo.setText(TO);
         TIME = Booking.getActivityInstance().BookinggetDataTime();
        desTime.setText(TIME);


//Navigation Buttons


        //Dashboard me button
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eticket.this,Dash_board.class);
                startActivity(intent);
            }
        });
        //Near me button
        nearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eticket.this,NearME.class);
                startActivity(intent);
            }
        });


        //Eticket button
        eTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eticket.this,Eticket.class);
                startActivity(intent);
            }
        });
        //settings button
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Eticket.this,Settings.class);
                startActivity(intent);
            }
        });

        //Booking button
        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Eticket.this,Booking.class);
                startActivity(intent);
            }
        });


    }
}