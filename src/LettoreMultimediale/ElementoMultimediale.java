package src.LettoreMultimediale;

public abstract class ElementoMultimediale {
    protected static int volume;
    protected static int luminositá;
    protected String title;

    public ElementoMultimediale(String title) {
        this.title = title;
        volume = 5;
        luminositá = 5;
    }

    public static void abbassaVolume(int vol) {
        int nuovoVolume = volume - vol;
        if (nuovoVolume >= 0) {
            setVolume(nuovoVolume);
        } else {
            System.out.println("Il volume non può essere inferiore a 0.");
        }
    }

    public static void alzaVolume(int vol) {
        int nuovoVolume = volume + vol;
        if (nuovoVolume <= 10) {
            setVolume(nuovoVolume);
        } else {
            System.out.println("Il volume non può essere maggiore di 10.");
        }
    }

    public static void abbassaLuminositá(int lum) {
        int nuovoaLuminositá = luminositá - lum;
        if (nuovoaLuminositá >= 1) {
            setLuminositá(nuovoaLuminositá);
        } else {
            System.out.println("La luminositá non può essere inferiore a 1.");
        }
    }


    public static void alzaLuminositá(int lum) {
        int nuovoaLuminositá = luminositá + lum;
        if (nuovoaLuminositá <= 10) {
            setLuminositá(nuovoaLuminositá);
        } else {
            System.out.println("La luminositá non può essere superiore a 10.");
        }
    }

    public static void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 10) {
            volume = newVolume;
        } else {
            System.out.println("Il volume deve essere compreso tra 0 e 10.");
        }
    }

    public static void setLuminositá(int newLuminositá) {
        if (newLuminositá >= 0 && newLuminositá <= 10) {
            luminositá = newLuminositá;
        } else {
            System.out.println("La luminositá deve essere compresa tra 0 e 10.");
        }
    }

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "title='" + title + '\'' +
                '}';
    }
}
