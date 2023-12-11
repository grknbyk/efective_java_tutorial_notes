package _1_static_factory_method;


public class Renk {
    private int kirmizi, yesil, mavi;

    // Private constructor to prevent direct instantiation
    private Renk(int kirmizi, int yesil, int mavi) {
        this.kirmizi = kirmizi;
        this.yesil = yesil;
        this.mavi = mavi;
    }

    public static Renk kirmizi() {
        return new Renk(255, 0, 0);
    }

    public static Renk yesil() {
        return new Renk(0, 255, 0);
    }

    public static Renk mavi() {
        return new Renk(0, 0, 255);
    }


}
