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
            StringBuilder videoRepresentation = new StringBuilder();
            for (int j = 0; j < volume; j++) {
                videoRepresentation.append("!");
            }
            for (int k = 0; k < luminositá; k++) {
                videoRepresentation.append("*");
            }

            System.out.println(this.title + " " + videoRepresentation);
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
