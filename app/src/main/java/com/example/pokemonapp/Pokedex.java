package com.example.pokemonapp;

import java.util.ArrayList;
import java.util.Arrays;

import static android.media.CamcorderProfile.get;

public class Pokedex {

    private ArrayList<Pokemon> pokedex;

    public Pokedex(){

        pokedex = new ArrayList<Pokemon>();


        ArrayList<String> abraAL = new ArrayList<>(Arrays.asList("psychic"));
        Pokemon abra = new Pokemon(abraAL,"Abra", 0,"abra", R.drawable.abra, false);
        pokedex.add(abra);

        ArrayList<String> kadabraAL = new ArrayList<>(Arrays.asList("psychic"));
        Pokemon kadabra = new Pokemon(kadabraAL,"Kadabra", 1,"abra", R.drawable.kadabra, false);
        pokedex.add(kadabra);

        ArrayList<String> alakazamAL = new ArrayList<>(Arrays.asList("psychic"));
        Pokemon alakazam = new Pokemon(alakazamAL,"Alakazam", 3,"abra", R.drawable.alakazam, true);
        pokedex.add(alakazam);

        ArrayList<String> weedleAL = new ArrayList<>(Arrays.asList("bug","poison"));
        Pokemon weedle = new Pokemon(weedleAL,"Weedle", 0,"weedle", R.drawable.weedle, false);
        pokedex.add(weedle);

        ArrayList<String> kakunaAL = new ArrayList<>(Arrays.asList("bug","poison"));
        Pokemon kakuna = new Pokemon(kakunaAL,"Kakuna", 1,"weedle", R.drawable.kakuna, false);
        pokedex.add(kakuna);

        ArrayList<String> beedrillAL = new ArrayList<>(Arrays.asList("bug","poison"));
        Pokemon beedrill = new Pokemon(weedleAL,"Beedrill", 2,"weedle", R.drawable.beedrill, true);
        pokedex.add(beedrill);

        ArrayList<String> bellsproutAL = new ArrayList<>(Arrays.asList("grass","poison"));
        Pokemon bellsprout = new Pokemon(bellsproutAL,"Bellsprout", 0,"bellsprout", R.drawable.bellsprout, false);
        pokedex.add(bellsprout);

        ArrayList<String> weepinbellAL = new ArrayList<>(Arrays.asList("grass","poison"));
        Pokemon weepinbell = new Pokemon(weepinbellAL,"Weepinbell", 1,"bellsprout", R.drawable.weepinbell, false);
        pokedex.add(weepinbell);

        ArrayList<String> victreebelAL = new ArrayList<>(Arrays.asList("grass","poison"));
        Pokemon victreebel = new Pokemon(victreebelAL,"Victreebel", 2,"bellsprout", R.drawable.victreebel, true);
        pokedex.add(victreebel);

        ArrayList<String> squirtleAL = new ArrayList<>(Arrays.asList("water"));
        Pokemon squirtle = new Pokemon(squirtleAL,"Squirtle", 0,"squirtle", R.drawable.squirtle, false);
        pokedex.add(squirtle);

        ArrayList<String>  wartortleAL = new ArrayList<>(Arrays.asList("water"));
        Pokemon wartortle = new Pokemon(wartortleAL,"Wartortle", 1,"squirtle", R.drawable.wartortle, false);
        pokedex.add(wartortle);

        ArrayList<String> blastoiseAL = new ArrayList<>(Arrays.asList("water"));
        Pokemon blastoise = new Pokemon(blastoiseAL,"Blastoise", 2,"squirtle", R.drawable.blastoise, true);
        pokedex.add(blastoise);

        ArrayList<String> bulbasaurAL = new ArrayList<>(Arrays.asList("grass, poison"));
        Pokemon bulbasaur = new Pokemon(bulbasaurAL,"Bulbasaur", 0,"bulbasaur", R.drawable.bulbasaur, false);
        pokedex.add(bulbasaur);

        ArrayList<String> ivysaurAL = new ArrayList<>(Arrays.asList("grass, poison"));
        Pokemon ivysaur = new Pokemon(ivysaurAL,"Ivysaur", 1,"bulbasaur", R.drawable.ivysaur, false);
        pokedex.add(ivysaur);

        ArrayList<String> venusaurAL = new ArrayList<>(Arrays.asList("grass, poison"));
        Pokemon venusaur = new Pokemon(venusaurAL,"Venusaur", 2,"bulbasaur", R.drawable.venusaur, true);
        pokedex.add(venusaur);

        ArrayList<String> caterpieAL = new ArrayList<>(Arrays.asList("bug"));
        Pokemon caterpie = new Pokemon(caterpieAL,"Caterpie", 0,"caterpie", R.drawable.caterpie, false);
        pokedex.add(caterpie);

        ArrayList<String> metapodAL = new ArrayList<>(Arrays.asList("bug"));
        Pokemon metapod = new Pokemon(metapodAL,"Metapod", 1,"caterpie", R.drawable.metapod, false);
        pokedex.add(metapod);

        ArrayList<String> butterfreeAL = new ArrayList<>(Arrays.asList("bug"));
        Pokemon butterfree = new Pokemon(butterfreeAL,"Butterfree", 2,"caterpie", R.drawable.butterfree, true);
        pokedex.add(butterfree);

        ArrayList<String> charmanderAL = new ArrayList<>(Arrays.asList("fire"));
        Pokemon charmander = new Pokemon(charmanderAL,"Charmander", 0,"charmander", R.drawable.charmander, false);
        pokedex.add(charmander);

        ArrayList<String> charmeleonAL = new ArrayList<>(Arrays.asList("fire"));
        Pokemon charmeleon = new Pokemon(charmeleonAL,"Charmeleon", 1,"charmander", R.drawable.charmeleon, false);
        pokedex.add(charmeleon);

        ArrayList<String> charizardAL = new ArrayList<>(Arrays.asList("fire","flying"));
        Pokemon charizard = new Pokemon(charizardAL,"Charizard", 2,"charmander", R.drawable.charizard, true);
        pokedex.add(charizard);

        ArrayList<String> chimcharAL = new ArrayList<>(Arrays.asList("fire"));
        Pokemon chimchar = new Pokemon(chimcharAL,"Chimchar", 0,"chimchar", R.drawable.chimchar, false);
        pokedex.add(chimchar);

        ArrayList<String> monfernoAL = new ArrayList<>(Arrays.asList("fire"));
        Pokemon monferno = new Pokemon(monfernoAL,"Monferno", 1,"monferno", R.drawable.monferno, false);
        pokedex.add(monferno);

        ArrayList<String> infernapeAL = new ArrayList<>(Arrays.asList("fire"));
        Pokemon infernape = new Pokemon(infernapeAL,"Infernape", 2,"infernape", R.drawable.infernape, true);
        pokedex.add(infernape);

        ArrayList<String> zubatAL = new ArrayList<>(Arrays.asList("poison","flying"));
        Pokemon zubat = new Pokemon(zubatAL,"Zubat", 0,"zubat", R.drawable.zubat, false);
        pokedex.add(zubat);

        ArrayList<String> golbatAL = new ArrayList<>(Arrays.asList("poison","flying"));
        Pokemon golbat = new Pokemon(golbatAL,"Golbat", 1,"zubat", R.drawable.golbat, false);
        pokedex.add(zubat);

        ArrayList<String> crobatAL = new ArrayList<>(Arrays.asList("poison","flying"));
        Pokemon crobat = new Pokemon(crobatAL,"Crobat", 2,"zubat", R.drawable.crobat, true);
        pokedex.add(zubat);

        ArrayList<String> dratiniAL = new ArrayList<>(Arrays.asList("dragon","flying"));
        Pokemon dratini = new Pokemon(dratiniAL,"Dratini", 0,"dratini", R.drawable.dratini, false);
        pokedex.add(dratini);

        ArrayList<String> dragonairAL = new ArrayList<>(Arrays.asList("dragon","flying"));
        Pokemon dragonair = new Pokemon(dragonairAL,"Dragonair", 1,"dratini", R.drawable.dragonair, false);
        pokedex.add(dragonair);

        ArrayList<String> dragoniteAL = new ArrayList<>(Arrays.asList("dragon","flying"));
        Pokemon dragonite = new Pokemon(dragoniteAL,"Dragonite", 2,"dratini", R.drawable.dragonite, true);
        pokedex.add(dragonite);

        ArrayList<String> eeveeAL = new ArrayList<>(Arrays.asList("normal"));
        Pokemon eevee = new Pokemon(eeveeAL,"Eevee", 0,"eevee", R.drawable.eevee, true);
        pokedex.add(eevee);

        ArrayList<String> vaporeonAL = new ArrayList<>(Arrays.asList("water"));
        Pokemon vaporeon = new Pokemon(vaporeonAL,"Vaporeon", 1,"vaporeon", R.drawable.vaporeon, true);
        pokedex.add(vaporeon);

        ArrayList<String> jolteonAL = new ArrayList<>(Arrays.asList("electric"));
        Pokemon jolteon = new Pokemon(jolteonAL,"Jolteon", 1,"jolteon", R.drawable.jolteon, true);
        pokedex.add(jolteon);

        ArrayList<String> flareonAL = new ArrayList<>(Arrays.asList("fire"));
        Pokemon flareon = new Pokemon(flareonAL,"Flareon", 1,"flareon", R.drawable.flareon, true);
        pokedex.add(flareon);

        ArrayList<String> espeonAL = new ArrayList<>(Arrays.asList("Psychic"));
        Pokemon espeon = new Pokemon(espeonAL,"Espeon", 1,"espeon", R.drawable.espeon, true);
        pokedex.add(espeon);

        ArrayList<String> umbreonAL = new ArrayList<>(Arrays.asList("Dark"));
        Pokemon umbreon = new Pokemon(umbreonAL,"Umbreon", 1,"umbreon", R.drawable.umbreon, true);
        pokedex.add(umbreon);

        ArrayList<String> piplupAL = new ArrayList<>(Arrays.asList("water"));
        Pokemon piplup = new Pokemon(piplupAL,"Piplup", 0,"piplup", R.drawable.piplup, false);
        pokedex.add(piplup);

        ArrayList<String> prinplupAL = new ArrayList<>(Arrays.asList("water"));
        Pokemon prinplup = new Pokemon(prinplupAL,"Prinplup", 1,"piplup", R.drawable.prinplup, true);
        pokedex.add(prinplup);

        ArrayList<String> empoleonAL = new ArrayList<>(Arrays.asList("water","steel"));
        Pokemon empoleon = new Pokemon(empoleonAL,"Empoleon", 2,"piplup", R.drawable.empoleon, true);
        pokedex.add(empoleon);

        ArrayList<String> raltsAL = new ArrayList<>(Arrays.asList("psychic","fairy"));
        Pokemon ralts = new Pokemon(raltsAL,"Ralts", 0,"ralts", R.drawable.ralts, false);
        pokedex.add(ralts);

        ArrayList<String> kirliaAL = new ArrayList<>(Arrays.asList("psychic","fairy"));
        Pokemon kirlia = new Pokemon(kirliaAL,"Kirlia", 1,"ralts", R.drawable.kirlia, false);
        pokedex.add(kirlia);

        ArrayList<String> gardevoirAL = new ArrayList<>(Arrays.asList("psychic","fairy"));
        Pokemon gardevoir = new Pokemon(gardevoirAL,"Gardevoir", 2,"ralts", R.drawable.gardevoir, true);
        pokedex.add(gardevoir);

        ArrayList<String> gastlyAL = new ArrayList<>(Arrays.asList("ghost","poison"));
        Pokemon gastly = new Pokemon(gastlyAL,"Gastly", 0,"gastly", R.drawable.gastly, false);
        pokedex.add(gastly);

        ArrayList<String> haunterAL = new ArrayList<>(Arrays.asList("ghost","poison"));
        Pokemon haunter = new Pokemon(haunterAL,"Haunter", 1,"gastly", R.drawable.haunter, false);
        pokedex.add(haunter);

        ArrayList<String> gengarAL = new ArrayList<>(Arrays.asList("ghost","poison"));
        Pokemon gengar = new Pokemon(gengarAL,"Gengar", 2,"gastly", R.drawable.gengar, true);
        pokedex.add(gengar);

        ArrayList<String> geodudeAL = new ArrayList<>(Arrays.asList("rock","ground"));
        Pokemon geodude = new Pokemon(geodudeAL,"Geodude", 0,"geodude", R.drawable.geodude, false);
        pokedex.add(geodude);

        ArrayList<String> gravelerAL = new ArrayList<>(Arrays.asList("rock","ground"));
        Pokemon graveler = new Pokemon(gravelerAL,"Gravelar", 1,"geodude", R.drawable.graveler, false);
        pokedex.add(graveler);

        ArrayList<String> golemAL = new ArrayList<>(Arrays.asList("rock","ground"));
        Pokemon golem = new Pokemon(golemAL,"Golem", 2,"geodude", R.drawable.golem, true);
        pokedex.add(golem);

        ArrayList<String> snoruntAL = new ArrayList<>(Arrays.asList("ice"));
        Pokemon snorunt = new Pokemon(snoruntAL,"Snorunt", 0,"snorunt", R.drawable.snorunt, false);
        pokedex.add(snorunt);

        ArrayList<String> glalieAL = new ArrayList<>(Arrays.asList("ice"));
        Pokemon glalie = new Pokemon(glalieAL,"Glalie", 1,"snorunt", R.drawable.glalie, false);
        pokedex.add(glalie);


    }

    public ArrayList<Pokemon> getPokedex(){
        return pokedex;
    }




}
