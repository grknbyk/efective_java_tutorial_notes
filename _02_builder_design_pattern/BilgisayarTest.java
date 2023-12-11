package _2_builder_design_pattern;

/**
 * BilgisayarTest
 */
public class BilgisayarTest {

    public static void main(String[] args) {
        Bilgisayar gamingPC = new BilgisayarBuilder("Intel i9", "32GB")
                .SSD("1TB")
                .ekranKarti("NVIDIA RTX 3090")
                .build();

        System.out.println(gamingPC);
    }
}