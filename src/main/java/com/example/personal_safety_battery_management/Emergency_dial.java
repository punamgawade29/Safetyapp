package com.example.personal_safety_battery_management;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Emergency_dial extends AppCompatActivity {
    Button callPolice, callAmbulance, callFireBrigade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_dial);



        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.appbar_background));


        //---------Emergency call to police
        callPolice = (Button) findViewById(R.id.call_police);
        callPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Emergency_dial.this, "Calling Police", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:7840976303"));                    //---Number
                startActivity(intent);
            }
        });

        //---------Emergency call to ambulance
        callAmbulance = (Button) findViewById(R.id.call_ambulance);
        callAmbulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Emergency_dial.this, "Calling Ambulance", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:7840976303"));                    //---Punam Number
                startActivity(intent);
            }
        });

        //---------Emergency call to fire brigade
        callFireBrigade = (Button) findViewById(R.id.call_fire_brigade);
        callFireBrigade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Emergency_dial.this, "Calling Fire Brigade", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:8830835266"));                    //---Punam's Number
                startActivity(intent);
            }
        });
    }
}