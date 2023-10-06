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
        for (int i = 0; i < this.durata; i++) {
            StringBuilder audioRepresentation = new StringBuilder();
            for (int j = 0; j < volume; j++) {
                audioRepresentation.append("!");
            }

            System.out.println(this.title + " " + audioRepresentation);
        }
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

