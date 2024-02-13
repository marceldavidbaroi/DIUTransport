package com.example.diutransport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Dash_board extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_dash_board);
//navigation bar buttons
        TextView home = findViewById(R.id.home_btn_tv);
        TextView nearMe = findViewById(R.id.nearMe_btn_tv);
        TextView eTicket = findViewById(R.id.eTicket_btn_tv);
        TextView booking = findViewById(R.id.preBook_btn_tv);
        TextView settings = findViewById(R.id.settings_btn_tv);

        TextView logid = findViewById(R.id.log_id);

    //setting log ID
        Intent Log_intent = getIntent();
        String ID = Log_intent.getStringExtra("ID");
        logid.setText(ID);


//Navigation Buttons


    //Dashboard me button
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dash_board.this,Dash_board.class);
                startActivity(intent);
            }
        });
    //Near me button
        nearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dash_board.this,NearME.class);
                startActivity(intent);
            }
        });


    //Eticket button
        eTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dash_board.this,Eticket.class);
                startActivity(intent);
            }
        });
    //settings button
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dash_board.this,Settings.class);
                startActivity(intent);
            }
        });

    //Booking button
        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dash_board.this,Booking.class);
                startActivity(intent);
            }
        });

    }
}