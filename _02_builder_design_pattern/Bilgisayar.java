package _2_builder_design_pattern;
public class Bilgisayar {
    // Bilgisayar'ın özellikleri
    private String islemci;
    private String RAM;
    private String SSD;
    private String ekranKarti;
    private boolean isTouchScreen;

    // Bu constructor artık 'protected' olarak işaretleniyor
    // böylece aynı paket içerisinden erişilebilir oluyor.
    protected Bilgisayar(BilgisayarBuilder builder) {
        this.islemci = builder.islemci;
        this.RAM = builder.RAM;
        this.SSD = builder.SSD;
        this.ekranKarti = builder.ekranKarti;
        this.isTouchScreen = builder.isTouchScreen;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "islemci='" + islemci + '\'' +
                ", RAM='" + RAM + '\'' +
                ", SSD='" + SSD + '\'' +
                ", ekranKarti='" + ekranKarti + '\'' +
                ", isTouchScreen=" + isTouchScreen +
                '}';
    }
}
