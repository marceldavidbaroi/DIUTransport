package com.example.diutransport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //remove action bar
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();



        setContentView(R.layout.log_in);

        TextView ID = findViewById(R.id.et_id);
        TextView password = findViewById(R.id.et_password);

        Button log_inBtn = findViewById(R.id.btn_login);


    //log in button
        log_inBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //password verification  "CSE"
                if(password.getText().toString().equals("CSE")) {

                    // ID for header
                    String id=ID.getText().toString();
                    Intent intent = new Intent(login.this, Dash_board.class);

                    //put ID for other activity
                    intent.putExtra("ID",id);
                    startActivity(intent);
                }

                else
                    Toast.makeText(login.this,"Password wrong",Toast.LENGTH_LONG).show();
            }
        });
    }
}