package src;

import src.LettoreMultimediale.ElementoMultimediale;
import src.LettoreMultimediale.Immagine;
import src.LettoreMultimediale.RegistrazioneAudio;
import src.LettoreMultimediale.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

        int numeroElementiInseriti = 0;

        while (numeroElementiInseriti < 5) {
            System.out.print("Inserisci il tipo di elemento (R per registrazione, V per video, I per immagine): ");
            String tipoElemento = input.nextLine().toUpperCase();

            if (tipoElemento.equals("R")) {
                System.out.print("Inserisci il titolo per la registrazione audio: ");
                String titolo = input.nextLine();
                elementiMultimediali[numeroElementiInseriti] = new RegistrazioneAudio(titolo);
                numeroElementiInseriti++;
            } else if (tipoElemento.equals("V")) {
                System.out.print("Inserisci il titolo per il video: ");
                String titolo = input.nextLine();
                elementiMultimediali[numeroElementiInseriti] = new Video(titolo);
                numeroElementiInseriti++;
            } else if (tipoElemento.equals("I")) {
                System.out.print("Inserisci il titolo per l'immagine: ");
                String titolo = input.nextLine();
                elementiMultimediali[numeroElementiInseriti] = new Immagine(titolo);
                numeroElementiInseriti++;
            } else {
                System.out.println("Tipo non valido. Usa R, V o I.");
            }
        }


        for (int i = 0; i < elementiMultimediali.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + elementiMultimediali[i].getTitle());
        }

        System.out.println("immetti un numero da 1 a 5 per eseguire uno degli oggetti che hai inserito, o inserisci 0 per uscire");

        int fileDaEseguire;

        do {
            System.out.print("Inserisci il numero del file da eseguire (0 per uscire, 1-5 per eseguire un elemento multimediale): ");
            fileDaEseguire = Integer.parseInt(input.nextLine());

            if (fileDaEseguire == 0) {
                break;
            }

            if (fileDaEseguire >= 1 && fileDaEseguire <= 5) {

                if (elementiMultimediali[fileDaEseguire - 1] instanceof RegistrazioneAudio) {
                    ((RegistrazioneAudio) elementiMultimediali[fileDaEseguire - 1]).riproduci();
                } else if (elementiMultimediali[fileDaEseguire - 1] instanceof Video) {
                    ((Video) elementiMultimediali[fileDaEseguire - 1]).riproduci();
                    System.out.println("");
                } else if (elementiMultimediali[fileDaEseguire - 1] instanceof Immagine) {
                    ((Immagine) elementiMultimediali[fileDaEseguire - 1]).show();
                }
            } else {
                System.out.println("Inserisci un numero valido (0 per uscire, 1-5 per eseguire un elemento multimediale).");
            }

        } while (true);


        input.close();
    }


}