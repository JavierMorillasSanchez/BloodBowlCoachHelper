package com.javierms.bloodbowlcoachhelper;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class cTeam extends AppCompatActivity {

    String name;
    String roster;
    String playStyle;
    ArrayList<Objects> playerTeam;
    short secondOportunity;
    short coachAssistant;
    short cheerleaders;
    short apothecary;
    String totalValue;

    public cTeam(String name, String roster, String playStyle, ArrayList<Objects> playerTeam,
                 short secondOportunity, short coachAssistant, short cheerleaders, short apothecary,
                 String totalValue) {
        this.name = name;
        this.roster = roster;
        this.playStyle = playStyle;
        this.playerTeam = playerTeam;
        this.secondOportunity = secondOportunity;
        this.coachAssistant = coachAssistant;
        this.cheerleaders = cheerleaders;
        this.apothecary = apothecary;
        this.totalValue = totalValue;
    }

    public cTeam(String name, String necromantic_horrors, String bb_sevens, ArrayList<Objects> jugadores, int secondOportunity, int coachAssistant, int cheerleaders, int apothecary, String totalValue) {
    }

    public String getName() {
        return name;
    }
    public String getRoster() {
        return roster;
    }
    public String getPlayStyle() {
        return playStyle;
    }
    public ArrayList<Objects> getPlayerTeam() {
        return playerTeam;
    }
    public short getSecondOportunity() {
        return secondOportunity;
    }
    public short getCoachAssistant() {
        return coachAssistant;
    }
    public short getCheerleaders() {
        return cheerleaders;
    }
    public short getApothecary() {
        return apothecary;
    }
    public String getTotalValue() {
        return totalValue;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRoster(String roster) {
        this.roster = roster;
    }
    public void setPlayStyle(String playStyle) {
        this.playStyle = playStyle;
    }
    public void setPlayerTeam(ArrayList<Objects> playerTeam) {
        this.playerTeam = playerTeam;
    }
    public void setSecondOportunity(short secondOportunity) {
        this.secondOportunity = secondOportunity;
    }
    public void setCoachAssistant(short coachAssistant) {
        this.coachAssistant = coachAssistant;
    }
    public void setCheerleaders(short cheerleaders) {
        this.cheerleaders = cheerleaders;
    }
    public void setApothecary(short apothecary) {
        this.apothecary = apothecary;
    }
    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

}
