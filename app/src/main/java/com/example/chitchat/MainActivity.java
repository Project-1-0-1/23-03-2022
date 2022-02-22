package com.example.chitchat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText phoneno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         getSupportActionBar().hide();
         btn=findViewById(R.id.next_btn);
         phoneno=findViewById(R.id.editTextPhone);

        btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Intent send = new Intent(MainActivity.this,Verification.class);
                 send.putExtra("Phoneno",phoneno.getText().toString());
                 startActivity(send);
                 finish();

             }
         });

    }
}