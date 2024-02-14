package com.es.programacion.pruebas.pokemon.assets;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Loader {

    public static BufferedImage  ImagerLoader(String path) {
        try {
            URL urlPath = Loader.class.getResource(path);
            BufferedImage bi = ImageIO.read(urlPath);
            return bi;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Clip loadSound(String path) {
        try {

            URL urlPath = Loader.class.getResource(path);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(urlPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            return clip;


        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        return null;
    }
}
