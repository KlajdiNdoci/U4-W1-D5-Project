package src.Multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {

    protected int volume = ElementoMultimediale.volume;

    protected int luminositá = ElementoMultimediale.luminositá;

    public Video(String title) {
        super(title);
    }


    @Override
    public void riproduci() {
        System.out.println("Il video con titolo" + this.title + "é in riproduzione");
    }
}
