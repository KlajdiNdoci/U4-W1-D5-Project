package src.LettoreMultimediale;

public class Video extends ElementoMultimediale implements Riproducibile {


    protected int durata;


    public Video(String title) {
        super(title);
        this.durata = 5;
    }


    @Override
    public void riproduci() {
        for (int i = 0; i < this.durata; i++) {
            StringBuilder audioRepresentation = new StringBuilder();
            for (int j = 0; j < volume; j++) {
                audioRepresentation.append("!");
            }
            for (int k = 0; k < luminositá; k++) {
                audioRepresentation.append("*");
            }

            System.out.println(this.title + " " + audioRepresentation);
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "volume=" + volume +
                ", durata=" + durata +
                ", luminositá=" + luminositá +
                ", title='" + title + '\'' +
                '}';
    }
}
