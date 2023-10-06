package src.Multimedia;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    protected int volume = ElementoMultimediale.volume;

    protected int durata;


    public RegistrazioneAudio(String title) {
        super(title);
    }


    @Override
    public void riproduci() {
        System.out.println("Il brano con titolo" + this.title + "é in riproduzione");
    }
}

