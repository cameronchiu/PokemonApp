package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Pokedex p1 = new Pokedex();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView opponent = (ImageView) findViewById(R.id.imageViewOpponent);
        TextView opponentName = (TextView) findViewById(R.id.textViewOpponentName);

        randEasy = (int)(Math.random()*p1.getPokedex().size());
        while(p1.getPokedex().get(randEasy).getEvolutionStatus()!=0){
            randEasy = (int)(Math.random()*p1.getPokedex().size());
        }
        opponent.setBackgroundResource(p1.getPokedex().get(randEasy).getDrawableid());
        String name = p1.getPokedex().get(randEasy).getName();
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
        opponentName.setText(capName);
        firstClickEasy=true;

    }


        boolean firstClickEasy = false;
        int randEasy;
        public void RadioButtonEasy(View v){
            ImageView opponent = (ImageView) findViewById(R.id.imageViewOpponent);
            TextView opponentName = (TextView) findViewById(R.id.textViewOpponentName);
            while(!firstClickEasy) {
                randEasy = (int) (Math.random() * p1.getPokedex().size());
                while (p1.getPokedex().get(randEasy).getEvolutionStatus() != 0) {
                    randEasy = (int) (Math.random() * p1.getPokedex().size());
                }
                firstClickEasy = true;
            }
            opponent.setBackgroundResource(p1.getPokedex().get(randEasy).getDrawableid());
            String name = p1.getPokedex().get(randEasy).getName();
            String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
            opponentName.setText(capName);
        }

    boolean firstClickMedium = false;
    int randMedium;
    public void RadioButtonMedium(View v){
        ImageView opponent = (ImageView) findViewById(R.id.imageViewOpponent);
        TextView opponentName = (TextView) findViewById(R.id.textViewOpponentName);
        while(!firstClickMedium) {
            randMedium = (int) (Math.random() * p1.getPokedex().size());
            while (p1.getPokedex().get(randMedium).getEvolutionStatus() != 1) {
                randMedium = (int) (Math.random() * p1.getPokedex().size());
            }
            firstClickMedium = true;
        }
        opponent.setBackgroundResource(p1.getPokedex().get(randMedium).getDrawableid());
        String name = p1.getPokedex().get(randMedium).getName();
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
        opponentName.setText(capName);
    }

    boolean firstClickHard = false;
    int randHard;
    public void RadioButtonHard(View v){
        ImageView opponent = (ImageView) findViewById(R.id.imageViewOpponent);
        TextView opponentName = (TextView) findViewById(R.id.textViewOpponentName);
        while(!firstClickHard) {
            randHard = (int) (Math.random() * p1.getPokedex().size());
            while (!p1.getPokedex().get(randHard).getIsFullyEvolved()) {
                randHard = (int) (Math.random() * p1.getPokedex().size());
            }
            firstClickHard = true;
        }
        opponent.setBackgroundResource(p1.getPokedex().get(randHard).getDrawableid());
        String name = p1.getPokedex().get(randHard).getName();
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
        opponentName.setText(capName);
    }



    public void populateSpinner (View v){
        ArrayList<String> spinnerList = new ArrayList<>(); //ArrayList of dropdown options

        ArrayList<String> selectedTypeList = new ArrayList<>();// ArrayList of types the user checks off

        ArrayList<CheckBox> allCheckBoxes = new ArrayList<>(Arrays.asList(

                (CheckBox) findViewById(R.id.checkBoxBug),
                (CheckBox) findViewById(R.id.checkBoxFairy),
                (CheckBox) findViewById(R.id.checkBoxDark),
                (CheckBox) findViewById(R.id.checkBoxDragon),
                (CheckBox) findViewById(R.id.checkBoxElectric),
                (CheckBox) findViewById(R.id.checkBoxFighting),
                (CheckBox) findViewById(R.id.checkBoxFire),
                (CheckBox) findViewById(R.id.checkBoxFlying),
                (CheckBox) findViewById(R.id.checkBoxGhost),
                (CheckBox) findViewById(R.id.checkBoxGrass),
                (CheckBox) findViewById(R.id.checkBoxGround),
                (CheckBox) findViewById(R.id.checkBoxIce),
                (CheckBox) findViewById(R.id.checkBoxNormal),
                (CheckBox) findViewById(R.id.checkBoxPoison),
                (CheckBox) findViewById(R.id.checkBoxRock),
                (CheckBox) findViewById(R.id.checkBoxSteel),
                (CheckBox) findViewById(R.id.checkBoxWater),
                (CheckBox) findViewById(R.id.checkBoxPsychic)
        ));
        for(int i =0; i<allCheckBoxes.size();i++){
            if(allCheckBoxes.get(i).isChecked()){
                String type = allCheckBoxes.get(i).getText().toString().toLowerCase();
                selectedTypeList.add(type);
            }
        }

        for(int i = 0; i<p1.getPokedex().size(); i++){
            int contains = 0;
            for(int j =0; j<selectedTypeList.size();j++) {
                if (p1.getPokedex().get(i).getTypes().contains(selectedTypeList.get(j))) {
                    contains++;
                }
            }
            if(contains==selectedTypeList.size()){
                spinnerList.add(p1.getPokedex().get(i).getName());
            }

        }

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerList);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinner);
        sItems.setAdapter(adapter);

    }

    public void getHints(View v){
        Switch hinter = (Switch) findViewById(R.id.switch1);
        TextView specs = (TextView) findViewById(R.id.textViewSpecs);
        RadioButton easy = (RadioButton) findViewById(R.id.radioButtonEasy);
        RadioButton medium = (RadioButton) findViewById(R.id.radioButtonMedium);
        RadioButton hard = (RadioButton) findViewById(R.id.radioButtonHard);
        int num = 0;
        if (hinter.isChecked()) {
            if (easy.isChecked() || medium.isChecked() || hard.isChecked()) {
                if (easy.isChecked()) {
                    num = randEasy;
                }
                if (medium.isChecked()) {
                    num = randMedium;
                }
                if (hard.isChecked()) {
                    num = randHard;
                }
            } else {
                num = randEasy;
            }

            String str = "";
            for (int i = 0; i < p1.getPokedex().get(num).getTypes().size(); i++) {
                str += p1.getPokedex().get(num).getTypes().get(i);
                if(p1.getPokedex().get(num).getTypes().size()>1&&i!=p1.getPokedex().get(num).getTypes().size()-1){
                    str+=", ";
                }
            }
            specs.setText(str);
        }

        else{
            specs.setText("");
        }
    }

    public void displayYourPokemon (View v){
        Spinner spinner = findViewById(R.id.spinner);
        if(spinner.getSelectedItem()!=null) {
            ImageButton yourPokemonPic = (ImageButton) findViewById(R.id.imageButton);
            String selection = spinner.getSelectedItem().toString();
            int yourPokemonDrawable = 0;
            for (int i = 0; i < p1.getPokedex().size(); i++) {
                if (p1.getPokedex().get(i).getName().equals(selection)) {
                    yourPokemonDrawable = p1.getPokedex().get(i).getDrawableid();
                }

            }
            yourPokemonPic.setBackgroundResource(yourPokemonDrawable);
        }


    }

    int opponentHealth = 100;
    int playerHealth = 100;

    public void fight (View v) {
        double attackMultiplier = 0;
        double defenseMultiplier = 0;
        double attackDamage = 0;
        double defenseDamage = 0;
        Spinner spinner = findViewById(R.id.spinner);
        String selection = spinner.getSelectedItem().toString();
        Pokemon playerPokemon = new Pokemon(null,null,0,null,0,false);
        for (int i = 0; i < p1.getPokedex().size(); i++) {
            if (p1.getPokedex().get(i).getName().equals(selection)) {
                playerPokemon = p1.getPokedex().get(i);
            }
        }
        RadioButton easy = (RadioButton) findViewById(R.id.radioButtonEasy);
        RadioButton medium = (RadioButton) findViewById(R.id.radioButtonMedium);
        RadioButton hard = (RadioButton) findViewById(R.id.radioButtonHard);
        ProgressBar opponenthealthbar = (ProgressBar) findViewById(R.id.progressBar);
        ProgressBar playerhealthbar = (ProgressBar) findViewById(R.id.progressBar2);
        int num = 0;
        if (easy.isChecked() || medium.isChecked() || hard.isChecked()) {
            if (easy.isChecked()) {
                num = randEasy;
                defenseMultiplier = 1;
            }
            if (medium.isChecked()) {
                num = randMedium;
                defenseMultiplier = 1.5;
            }
            if (hard.isChecked()) {
                num = randHard;
                defenseMultiplier = 2;
            }
        } else {
            num = randEasy;
            defenseMultiplier = 1;
        }
        Pokemon opponentPokemon = p1.getPokedex().get(num);

        if(playerPokemon.getEvolutionStatus()==0){
            attackMultiplier = 1;
        }
        if(playerPokemon.getEvolutionStatus()==1&&playerPokemon.getIsFullyEvolved()==false){
            attackMultiplier = 1.5;
        }
        if(playerPokemon.getIsFullyEvolved()==true){
            attackMultiplier = 2;
        }

        attackDamage = checkEffectiveness(opponentPokemon,playerPokemon);
        opponentHealth -= (int)(attackDamage*12*attackMultiplier);
        opponenthealthbar.setProgress(opponentHealth);
        defenseDamage = checkEffectiveness(playerPokemon,opponentPokemon);
        playerHealth -= (int)(defenseDamage*12*defenseMultiplier);
        playerhealthbar.setProgress(playerHealth);

        TextView winLoseScreen = (TextView) findViewById(R.id.textViewWinLose);
        ImageView opponent = (ImageView) findViewById(R.id.imageViewOpponent);
        ImageButton yourPokemonPic = (ImageButton) findViewById(R.id.imageButton);
        if(opponentHealth <=0&&playerHealth<=0){
            opponent.setBackgroundResource(R.drawable.fainted);
            yourPokemonPic.setBackgroundResource(R.drawable.fainted);
            winLoseScreen.setVisibility(View.VISIBLE);
            winLoseScreen.setText("TIE");

        }
        else {
            if (opponentHealth <= 0) {
                opponent.setBackgroundResource(R.drawable.fainted);
                winLoseScreen.setVisibility(View.VISIBLE);
                winLoseScreen.setText("YOU WIN");

            }
            if (playerHealth <= 0) {
                yourPokemonPic.setBackgroundResource(R.drawable.fainted);
                winLoseScreen.setVisibility(View.VISIBLE);
                winLoseScreen.setText("YOU LOSE");

            }
        }

    }

    //problems:
    // - When one type has no effect on another, the entire attackWeight has 0 power

    public double checkEffectiveness(Pokemon opponent, Pokemon player){
        ArrayList<String> opponentTypes = new ArrayList<String>();
        ArrayList<String> playerTypes = new ArrayList<String>();
        opponentTypes = opponent.getTypes();
        playerTypes = player.getTypes();
        double attackWeight = 1;
        for(int i = 0; i<playerTypes.size(); i++){
            for(int j = 0; j<opponentTypes.size();j++){
                if(playerTypes.get(i).equals("normal")){
                    if(opponentTypes.get(j).equals("rock")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("ghost")){
                        attackWeight *=  0;
                    }
                    if(opponentTypes.get(j).equals("steel")){
                        attackWeight *=  .5;
                    }
                }
                if(playerTypes.get(i).equals("fire")){
                    if(opponentTypes.get(j).equals("fire")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("water")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("grass")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("ice")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("bug")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("rock")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("dragon")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("steel")){
                        attackWeight *= 2;
                    }
                }
                if(playerTypes.get(i).equals("water")){
                    if(opponentTypes.get(j).equals("fire")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("water")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("grass")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("ground")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("rock")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("dragon")){
                        attackWeight *= .5;
                    }
                }

                if(playerTypes.get(i).equals("electric")){
                    if(opponentTypes.get(j).equals("water")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("electric")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("grass")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("ground")){
                        attackWeight *= 0;
                    }
                    if(opponentTypes.get(j).equals("flying")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("dragon")){
                        attackWeight *= .5;
                    }
                }
                if(playerTypes.get(i).equals("grass")){
                    if(opponentTypes.get(j).equals("fire")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("water")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("grass")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("poison")){
                        attackWeight *= 0;
                    }
                    if(opponentTypes.get(j).equals("flying")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("dragon")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("steel")){
                        attackWeight *= .5;
                    }

                }
                if(playerTypes.get(i).equals("ice")){
                    if(opponentTypes.get(j).equals("fire")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("water")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("grass")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("ice")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("ground")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("flying")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("dragon")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("steel")){
                        attackWeight *= .5;
                    }

                }
                if(playerTypes.get(i).equals("fighting")){
                    if(opponentTypes.get(j).equals("normal")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("ice")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("poison")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("flying")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("psychic")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("bug")){
                        attackWeight *= .5;
                    }
                    if(opponentTypes.get(j).equals("rock")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("ghost")){
                        attackWeight *= 0;
                    }
                    if(opponentTypes.get(j).equals("dark")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("steel")){
                        attackWeight *= 2;
                    }
                    if(opponentTypes.get(j).equals("fairy")){
                        attackWeight *= .5;
                    }

                }
                if(playerTypes.get(i).equals("poison")) {
                    if (opponentTypes.get(j).equals("grass")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("poison")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("ground")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("rock")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("ghost")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= 0;
                    }
                    if (opponentTypes.get(j).equals("fairy")) {
                        attackWeight *= 2;

                    }
                }
                if(playerTypes.get(i).equals("ground")) {
                    if (opponentTypes.get(j).equals("fire")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("electric")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("grass")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("poison")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("flying")) {
                        attackWeight *= 0;
                    }
                    if (opponentTypes.get(j).equals("bug")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("rock")) {
                        attackWeight *= 2;

                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= 2;

                    }
                }
                if(playerTypes.get(i).equals("flying")) {
                    if (opponentTypes.get(j).equals("electric")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("grass")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("fighting")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("bug")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("rock")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= .5;
                    }
                }
                if(playerTypes.get(i).equals("psychic")) {
                    if (opponentTypes.get(j).equals("fighting")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("poison")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("psychic")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("dark")) {
                        attackWeight *= 0;
                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= .5;
                    }
                }
                if(playerTypes.get(i).equals("bug")) {
                    if (opponentTypes.get(j).equals("fire")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("grass")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("fighting")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("poison")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("psychic")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("flying")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("ghost")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("dark")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("fairy")) {
                        attackWeight *= .5;
                    }
                }
                if(playerTypes.get(i).equals("rock")) {
                    if (opponentTypes.get(j).equals("fire")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("ice")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("fighting")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("ground")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("flying")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("bug")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= .5;
                    }
                }
                if(playerTypes.get(i).equals("ghost")) {
                    if (opponentTypes.get(j).equals("normal")) {
                        attackWeight *= 0;
                    }
                    if (opponentTypes.get(j).equals("psychic")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("ghost")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("dark")) {
                        attackWeight *= .5;
                    }
                }
                if(playerTypes.get(i).equals("dragon")) {
                    if (opponentTypes.get(j).equals("dragon")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("fairy")) {
                        attackWeight *= 0;
                    }
                }
                if(playerTypes.get(i).equals("dark")) {
                    if (opponentTypes.get(j).equals("fighting")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("psychic")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("ghost")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("dark")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("fairy")) {
                        attackWeight *= .5;
                    }
                }
                if(playerTypes.get(i).equals("steel")) {
                    if (opponentTypes.get(j).equals("fire")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("water")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("electric")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("ice")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("rock")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("fairy")) {
                        attackWeight *= 2;
                    }
                }
                if(playerTypes.get(i).equals("fairy")) {
                    if (opponentTypes.get(j).equals("fire")) {
                        attackWeight *= .5;
                    }
                    if (opponentTypes.get(j).equals("fighting")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("dragon")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("dark")) {
                        attackWeight *= 2;
                    }
                    if (opponentTypes.get(j).equals("steel")) {
                        attackWeight *= .5;
                    }
                }
            }
        }

        return attackWeight;
    }



}
