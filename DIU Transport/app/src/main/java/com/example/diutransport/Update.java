package com.example.diutransport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Update extends AppCompatActivity {
    static Update INSTANCE;
    String B1;
    String B2;
    String B3;
    String B4;
    String B5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        INSTANCE=this;
        super.onCreate(savedInstanceState);
        //remove action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_update);

        //navigation bar buttons
        TextView home = findViewById(R.id.home_btn_tv);
        TextView nearMe = findViewById(R.id.nearMe_btn_tv);
        TextView eTicket = findViewById(R.id.eTicket_btn_tv);
        TextView booking = findViewById(R.id.preBook_btn_tv);
        TextView settings = findViewById(R.id.settings_btn_tv);

//activity var
        EditText editText_B1  =findViewById(R.id.et_B1);
        EditText editText_B2  =findViewById(R.id.et_B2);
        EditText editText_B3  =findViewById(R.id.et_B3);
        EditText editText_B4  =findViewById(R.id.et_B4);
        EditText editText_B5  =findViewById(R.id.et_B5);

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
                Intent intent = new Intent(Update.this,Dash_board.class);
                startActivity(intent);
            }
        });
        //Near me button
        nearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Update.this,NearME.class);
                startActivity(intent);
            }
        });


        //Eticket button
        eTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Update.this,Eticket.class);
                startActivity(intent);
            }
        });
        //settings button
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Update.this,Settings.class);
                startActivity(intent);
            }
        });

        //Booking button
        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Update.this,Booking.class);
                startActivity(intent);
            }
        });

        //all button workings
        button_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 B1 = editText_B1.getText().toString();
            }
        });
        button_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2 = editText_B2.getText().toString();
            }
        });
        button_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3 = editText_B3.getText().toString();
            }
        });
        button_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4 = editText_B4.getText().toString();
            }
        });
        button_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5 = editText_B5.getText().toString();
            }
        });


    }
    // to use data in other activity without intent
    //using static method
    public static Update getActivityInstance()
    {
        return INSTANCE;
    }

    public String UgetDataB1()
    {
        return this.B1;
    }
    public String UgetDataB2()
    {
        return this.B2;
    }
    public String UgetDataB3()
    {
        return this.B3;
    }
    public String UgetDataB4()
    {
        return this.B4;
    }
    public String UgetDataB5()
    {
        return this.B5;
    }
}