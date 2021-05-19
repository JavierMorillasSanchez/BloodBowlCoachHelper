package com.javierms.bloodbowlcoachhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMyTeams = findViewById(R.id.btnRosterBB);
        Button btnMenuNewTeam = findViewById(R.id.btnNewTeam);

        btnMyTeams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), itemList.class);
                startActivity(intent);
            }
        });

        btnMenuNewTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), createteam.class);
                startActivity(intent);
            }
        });

    }

}