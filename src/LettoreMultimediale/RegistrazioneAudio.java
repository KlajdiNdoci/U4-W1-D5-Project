package src.LettoreMultimediale;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    protected int durata = 3;

    public RegistrazioneAudio(String title) {
        super(title);
    }

    public RegistrazioneAudio(String title, int durata) {
        super(title);
        this.durata = durata;
    }


    @Override
    public void riproduci() {
        System.out.println("Il brano con titolo" + this.title + "é in riproduzione");
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio{" +
                "volume=" + volume +
                ", durata=" + durata +
                ", title='" + title + '\'' +
                '}';
    }
}

