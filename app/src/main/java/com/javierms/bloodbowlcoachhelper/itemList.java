package com.javierms.bloodbowlcoachhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class itemList extends AppCompatActivity {

    ListView lvTeamList;
    private List<cTeam> myList;
    ListAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

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

        lvTeamList = findViewById(R.id.lvTeamsList);

        myList = new ArrayList<>();

        ArrayList<Objects> jugadores = new ArrayList<>();

        myList.add(new cTeam("Wulfenburg Crypt-Stealers", "Necromantic Horrors",
                "BB Sevens", jugadores,0,0,0,
                0, ""));

        myAdapter = new bbAdapter(getApplicationContext(), R.layout.activity_itembb, myList);

        lvTeamList.setAdapter(myAdapter);

        lvTeamList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
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



















    /*public boolean onOptionsItemSelected(@NonNull MenuItem opcionmenu) {

        //recogemos el id del menu pulsado
        int id = opcionmenu.getItemId();

        if(id==R.id.btnMenuMyTeams){

        }
        if(id==R.id.btnMenuNewTeam){

        }
        if(id==R.id.btnMenuClose){

        }

        return super.onOptionsItemSelected(opcionmenu);
    }*/


}