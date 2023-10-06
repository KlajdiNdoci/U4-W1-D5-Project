package src.Multimedia;

public abstract class ElementoMultimediale {
    protected static int volume = 5;
    protected static int luminositá = 5;
    protected String title;

    public ElementoMultimediale(String title) {
        this.title = title;
    }
    

    public static void setVolume(int newVolume) {
        if (newVolume >= 1 && newVolume <= 10) {
            volume = newVolume;
        } else {
            System.out.println("Il volume deve essere compreso tra 1 e 10.");
        }
    }

    public static void setLuminosità(int newLuminositá) {
        if (newLuminositá >= 1 && newLuminositá <= 10) {
            luminositá = newLuminositá;
        } else {
            System.out.println("La luminositá deve essere compresa tra 1 e 10.");
        }
    }
}
