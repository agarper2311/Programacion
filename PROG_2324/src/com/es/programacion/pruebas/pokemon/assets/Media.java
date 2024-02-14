package com.es.programacion.pruebas.pokemon.assets;

import javax.sound.sampled.Clip;
import java.awt.image.BufferedImage;

public class Media {

    // IMAGES
    public static BufferedImage TITLE_COVER, SELECTED_BOX;
    public static BufferedImage BULBASAUR, PIKACHU, CHARMANDER, SQUIRTLE, MEW, EVEE, JIGGLYPUFF, DRATINI, CATERPIE, PIDGEY, MAGIKARP;

    // SOUNDS
    public static Clip OPENING;
    public static Clip LAVENDER;
    public static Clip PALLET_TOWN;
    public static Clip CLICK;



    public static void inicializarMedia() {

        TITLE_COVER = Loader.ImagerLoader("/pokemonMedia/images/title.png");
        SELECTED_BOX = Loader.ImagerLoader("/pokemonMedia/images/selected_box.png");

        BULBASAUR = Loader.ImagerLoader("/pokemonMedia/images/bulbasaur.png");
        PIKACHU = Loader.ImagerLoader("/pokemonMedia/images/pikachu.png");
        CHARMANDER = Loader.ImagerLoader("/pokemonMedia/images/charmander.png");
        PIDGEY = Loader.ImagerLoader("/pokemonMedia/images/pidgey.png");
        EVEE = Loader.ImagerLoader("/pokemonMedia/images/evee.png");
        CATERPIE = Loader.ImagerLoader("/pokemonMedia/images/caterpie.png");
        DRATINI = Loader.ImagerLoader("/pokemonMedia/images/dratini.png");
        SQUIRTLE = Loader.ImagerLoader("/pokemonMedia/images/squirtle.png");
        MEW = Loader.ImagerLoader("/pokemonMedia/images/mew.png");
        JIGGLYPUFF = Loader.ImagerLoader("/pokemonMedia/images/jigglypuff.png");
        MAGIKARP = Loader.ImagerLoader("/pokemonMedia/images/magikarp.png");

        CLICK = Loader.loadSound("/pokemonMedia/sounds/click0.wav");
        LAVENDER = Loader.loadSound("/pokemonMedia/sounds/lavender.wav");
        PALLET_TOWN = Loader.loadSound("/pokemonMedia/sounds/pallet_town.wav");
        OPENING = Loader.loadSound("/pokemonMedia/sounds/opening.wav");
    }

    public static void emptyBuffer(Clip clip) {
        if (clip.isActive() || clip.isOpen() || clip.isRunning()) {
            clip.stop();
            clip.flush();
            clip.drain();
        }
    }

    public static BufferedImage imageFactory(String imagen){

        if (imagen.equalsIgnoreCase("pikachu")){
            return PIKACHU;
        } else if (imagen.equalsIgnoreCase("bulbasaur")) {
            return BULBASAUR;
        } else if (imagen.equalsIgnoreCase("charmander")){
            return CHARMANDER;
        } else if (imagen.equalsIgnoreCase("squirtle")) {
            return SQUIRTLE;
        } else if (imagen.equalsIgnoreCase("caterpie")) {
            return CATERPIE;
        } else if (imagen.equalsIgnoreCase("pidgey")){
            return PIDGEY;
        } else if (imagen.equalsIgnoreCase("jigglypuff")) {
            return JIGGLYPUFF;
        } else if (imagen.equalsIgnoreCase("mew")) {
            return MEW;
        } else if (imagen.equalsIgnoreCase("evee")){
            return EVEE;
        } else if (imagen.equalsIgnoreCase("dratini")) {
            return DRATINI;
        } else {
            return MAGIKARP;
        }

    }


}
