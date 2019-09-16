package com.example.pokemonapp;

import java.util.ArrayList;

public class Pokemon {
    private ArrayList<String> types = new ArrayList<String>();
    private String name;
    private int evolutionStatus; //1,2,3.. are levels of evolution; 5 is fully evolved
    private String basic; //name of pre-evolution pokemon
    private int drawableid;
    private boolean isFullyEvolved;

    public Pokemon(ArrayList types, String name, int evolutionStatus, String basic, int drawableid, boolean isFullyEvolved){
        this.types = types;
        this.name = name;
        this.evolutionStatus = evolutionStatus;
        this.basic = basic;
        this.drawableid = drawableid;
        this.isFullyEvolved = isFullyEvolved;
    }

    public int getDrawableid(){
        return drawableid;
    }

    public String getName(){
        return name;
    }

    public String getBasic(){
        return basic;
    }

    public int getEvolutionStatus(){
        return evolutionStatus;
    }

    public boolean getIsFullyEvolved(){
        return isFullyEvolved;
    }

    public ArrayList<String> getTypes(){
        return types;
    }
}
