package com.example.diutransport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Booking extends AppCompatActivity {
    static Booking INSTANCE;
    String buttonSelection;
    String from_value;
    String to_value;
    String time_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        INSTANCE=this;
        String[] destination;
        String[] time_available;

        super.onCreate(savedInstanceState);
        //remove action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_booking);

//navigation bar buttons
        TextView home = findViewById(R.id.home_btn_tv);
        TextView nearMe = findViewById(R.id.nearMe_btn_tv);
        TextView eTicket = findViewById(R.id.eTicket_btn_tv);
        TextView booking = findViewById(R.id.preBook_btn_tv);
        TextView settings = findViewById(R.id.settings_btn_tv);


        destination = getResources().getStringArray(R.array.Destination);
        time_available = getResources().getStringArray(R.array.time);


//page elements
        TextView from = findViewById(R.id.from_tv);
        TextView to = findViewById(R.id.to_tv);
        TextView time = findViewById(R.id.time_tv);

        Spinner from_spinner = findViewById(R.id.destination_spinner_from);
        Spinner to_spinner = findViewById(R.id.destination_spinner_to);
        Spinner time_spinner = findViewById(R.id.time_spinner);

        RadioGroup radioGroup = findViewById(R.id.Bus_type_radioGroup);


        Button book = findViewById(R.id.preBook_btn);




//from spinner
        ArrayAdapter<String> arrayAdapterfrom = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.tv_sample_view,destination);
        from_spinner.setAdapter(arrayAdapterfrom);


//to spinner
        ArrayAdapter<String> arrayAdapterto = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.tv_sample_view,destination);
        to_spinner.setAdapter(arrayAdapterto);

//to spinner
        ArrayAdapter<String> arrayAdaptertime = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.tv_sample_view,time_available);
        time_spinner.setAdapter(arrayAdaptertime);





        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //radio
                int selected_busType = radioGroup.getCheckedRadioButtonId();
                RadioButton selected_bus = (RadioButton) findViewById(selected_busType);
                 buttonSelection =  selected_bus.getText().toString();

                 from_value = from_spinner.getSelectedItem().toString();
                 to_value = to_spinner.getSelectedItem().toString();
                 time_value = time_spinner.getSelectedItem().toString();
                Intent intent = new Intent(Booking.this,Eticket.class);
                startActivity(intent);
            }
        });





        //Navigation Buttons


        //Dashboard me button
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Booking.this,Dash_board.class);
                startActivity(intent);
            }
        });
        //Near me button
        nearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Booking.this,NearME.class);
                startActivity(intent);
            }
        });


        //Eticket button
        eTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Booking.this,Eticket.class);
                startActivity(intent);
            }
        });
        //settings button
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Booking.this,Settings.class);
                startActivity(intent);
            }
        });

        //Booking button
        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Booking.this,Booking.class);
                startActivity(intent);
            }
        });

    }
    // to use data in other activity without intent
    //using static method
    public static Booking getActivityInstance()
    {
        return INSTANCE;
    }

    public String BookinggetDataBusType()
    {
        return this.buttonSelection;
    }
    public String BookinggetDataFrom()
    {
        return this.from_value;
    }
    public String BookinggetDataTo()
    {
        return this.to_value;
    }
    public String BookinggetDataTime()
    {
        return this.time_value;
    }
}