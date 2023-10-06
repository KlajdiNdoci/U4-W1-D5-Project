package src.LettoreMultimediale;

public class Immagine extends ElementoMultimediale implements NonRiproducibile {


    public Immagine(String title) {
        super(title);
    }

    @Override
    public void show() {

        StringBuilder imageRepresentation = new StringBuilder();
        for (int i = 0; i < volume; i++) {
            imageRepresentation.append("*");
        }


        System.out.println(this.title + " " + imageRepresentation);

    }

    @Override
    public String toString() {
        return "Immagine{" +
                "title='" + title + '\'' +
                "luminositá='" + luminositá + '\'' +
                '}';
    }
}
