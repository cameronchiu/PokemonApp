package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
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
        int attackDamage = 0;
        int defenseDamage = 0;
        Spinner spinner = findViewById(R.id.spinner);
        String selection = spinner.getSelectedItem().toString();
        for (int i = 0; i < p1.getPokedex().size(); i++) {
            if (p1.getPokedex().get(i).getName().equals(selection)) {
                Pokemon playerPokemon = p1.getPokedex().get(i);
            }
        }
        RadioButton easy = (RadioButton) findViewById(R.id.radioButtonEasy);
        RadioButton medium = (RadioButton) findViewById(R.id.radioButtonMedium);
        RadioButton hard = (RadioButton) findViewById(R.id.radioButtonHard);
        int num = 0;
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
        } else
            num = randEasy;
        Pokemon opponentPokemon = p1.getPokedex().get(num);

    }

    public int checkEffectiveness(Pokemon opponent, Pokemon player){
        ArrayList<String> opponentTypes = new ArrayList<String>();
        ArrayList<String> playerTypes = new ArrayList<String>();
        opponentTypes = opponent.getTypes();
        playerTypes = player.getTypes();
        //for loop needed
        for(int i = 0; i<opponentTypes.size(); i++){
            for(int j = 0; j<playerTypes.size();j++){
                if(opponentTypes.get(i).equals("normal")){ //should take in account for both types being super effective against both
                    if(playerTypes.get(i).equals("rock")){
                        return 1;
                    }
                    if(playerTypes.get(i).equals("fire")){
                        return 1;
                    }
                    if(playerTypes.get(i).equals("water")){
                        return 1;
                    }
                }
            }
        }

        return 0;
    }



}
