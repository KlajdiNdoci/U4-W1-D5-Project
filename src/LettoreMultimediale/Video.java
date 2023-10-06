package src.LettoreMultimediale;

public class Video extends ElementoMultimediale implements Riproducibile {


    protected int durata;


    public Video(String title) {
        super(title);
        this.durata = 5;
    }


    @Override
    public void riproduci() {
        System.out.println("Il video con titolo" + this.title + "é in riproduzione");
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
