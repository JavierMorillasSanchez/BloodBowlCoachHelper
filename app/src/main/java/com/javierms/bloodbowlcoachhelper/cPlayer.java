package com.javierms.bloodbowlcoachhelper;

import java.io.Serializable;
import java.util.ArrayList;

public class cPlayer  implements Serializable {

    String name;
    String position;
    short movement;
    short strength;
    String agility;
    String passing;
    ArrayList<String> abilities;
    int baseValue;

    public void cPlayerNull(){
        this.name = "";
        this.position = "";
        this.movement = 0;
        this.strength = 0;
        this.agility = "";
        this.passing = "";
        this.abilities = null;
        this.baseValue = 0;
    }

    public cPlayer(String name, String position, short movement, short strength, String agility, String passing, ArrayList<String> abilities, int baseValue) {
        this.name = name;
        this.position = position;
        this.movement = movement;
        this.strength = strength;
        this.agility = agility;
        this.passing = passing;
        this.abilities = abilities;
        this.baseValue = baseValue;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public short getMovement() {
        return movement;
    }
    public short getStrength() {
        return strength;
    }
    public String getAgility() {
        return agility;
    }
    public String getPassing() {
        return passing;
    }
    public ArrayList<String> getAbilities() {
        return abilities;
    }
    public int getBaseValue() {
        return baseValue;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void setMovement(short movement) {
        this.movement = movement;
    }
    public void setStrength(short strength) {
        this.strength = strength;
    }
    public void setAgility(String agility) {
        this.agility = agility;
    }
    public void setPassing(String passing) {
        this.passing = passing;
    }
    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }
    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }
}
