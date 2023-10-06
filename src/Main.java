package src;

import src.LettoreMultimediale.Immagine;
import src.LettoreMultimediale.RegistrazioneAudio;
import src.LettoreMultimediale.Video;

import java.util.Scanner;

import static src.LettoreMultimediale.ElementoMultimediale.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        RegistrazioneAudio reg1 = new RegistrazioneAudio("registrazione 1");
        Video vid1 = new Video("video 1");
        Immagine img1 = new Immagine("image 1");

        reg1.riproduci();


        abbassaVolume(3);
        abbassaLuminositá(3);
        System.out.println(reg1);
        System.out.println(img1);
        reg1.riproduci();
        vid1.riproduci();


        System.out.println(vid1);
        alzaLuminositá(5);
        alzaVolume(2);
        vid1.riproduci();
        img1.show();

        System.out.println(reg1);


        System.out.println(vid1);


        input.close();
    }
}