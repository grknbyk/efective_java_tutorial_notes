package _2_builder_design_pattern;
public class BilgisayarBuilder {
    protected String islemci;
    protected String RAM;
    protected String SSD;
    protected String ekranKarti;
    protected boolean isTouchScreen = false; // default value

    public BilgisayarBuilder(String islemci, String RAM) {
        this.islemci = islemci;
        this.RAM = RAM;
    }

    public BilgisayarBuilder SSD(String SSD) {
        this.SSD = SSD;
        return this;
    }

    public BilgisayarBuilder ekranKarti(String ekranKarti) {
        this.ekranKarti = ekranKarti;
        return this;
    }

    public BilgisayarBuilder isTouchScreen(boolean isTouchScreen) {
        this.isTouchScreen = isTouchScreen;
        return this;
    }

    public Bilgisayar build() {
        return new Bilgisayar(this);
    }


}
