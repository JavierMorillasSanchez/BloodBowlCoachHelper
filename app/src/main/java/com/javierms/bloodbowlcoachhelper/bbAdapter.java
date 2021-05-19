package com.javierms.bloodbowlcoachhelper;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class bbAdapter extends ArrayAdapter<cTeam> {

    private List<cTeam> myTeams;
    private Context myContext;

    public bbAdapter(@NonNull Context context, int resource, @NonNull List<cTeam> objects) {
        super(context, resource, objects);
        this.myTeams = objects;
        this.myContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null){
            view = LayoutInflater.from(myContext).inflate(R.layout.activity_itembb,null);

            cTeam teams = myTeams.get(position);

            TextView txtTeamName = view.findViewById(R.id.txtTeamName);
            TextView txtTeamRoster = view.findViewById(R.id.txtTeamRoster);
            TextView txtTeamStyle = view.findViewById(R.id.txtBloodbowlStyle);
            TextView txtTotalValue = view.findViewById(R.id.txtTeamValue);

            txtTeamName.setText(teams.getName());
            txtTeamRoster.setText(teams.getRoster());
            txtTeamStyle.setText(teams.getPlayStyle());
            txtTotalValue.setText(teams.getTotalValue());

        }

        return view;

    }
}
