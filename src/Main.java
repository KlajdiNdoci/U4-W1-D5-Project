package src;

import src.LettoreMultimediale.RegistrazioneAudio;
import src.LettoreMultimediale.Video;

import java.util.Scanner;

import static src.LettoreMultimediale.ElementoMultimediale.abbassaVolume;
import static src.LettoreMultimediale.ElementoMultimediale.alzaVolume;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        RegistrazioneAudio reg1 = new RegistrazioneAudio("registrazione 1");
        Video vid1 = new Video("video 1");


        abbassaVolume(3);
        System.out.println(reg1);


        System.out.println(vid1);
        alzaVolume(2);
        System.out.println(reg1);


        System.out.println(vid1);


        input.close();
    }
}