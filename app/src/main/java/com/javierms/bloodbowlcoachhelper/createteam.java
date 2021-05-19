
package com.javierms.bloodbowlcoachhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class createteam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createteam);

        //start toolbar code
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //end toolbar code
    }

    //start menu code
    @Override
    public boolean onCreateOptionsMenu(Menu miMenu) {
        getMenuInflater().inflate(R.menu.menu, miMenu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem opcionmenu) {
        int id = opcionmenu.getItemId();
        if(id==R.id.btnMenuMyTeams){
            Intent intent = new Intent(getApplicationContext(), itemList.class);
            startActivity(intent);
        }
        if(id==R.id.btnMenuNewTeam){
            Intent intent = new Intent(getApplicationContext(), createteam.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(opcionmenu);
    }

    //end of menu code
}