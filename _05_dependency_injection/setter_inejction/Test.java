package _5_dependency_injection.setter_inejction;

/* 
Setter Injection (Setter Enjeksiyonu) Örneği:

Örnek Senaryo: 
    Bir oyun geliştiriyorsunuz ve oyun karakterleri arasında geçiş yapabilme yeteneği eklemek istiyorsunuz. 
    Farklı karakterlerin geçişleri dinamik olarak yapılabilmeli ve her bir karakterin özel yeteneklerini kullanabilmelisiniz.

Bu örnekte, Character arayüzü, oyun karakterlerinin temel özelliklerini tanımlar. 
Warrior ve Mage sınıfları, bu arayüzü uygular ve farklı oyun karakterlerini temsil eder.

Game sınıfı, Character bağımlılığını setter enjeksiyon yöntemiyle alır. 
Bu sayede, oyunda aktif karakterin dinamik olarak değiştirilmesi ve her karakterin özel yeteneklerinin kullanılması sağlanır.

Main sınıfında, Warrior bir Character uygulaması olarak oluşturulur ve bu karakter Game nesnesiyle birlikte kullanılır.

Avantajları:
-Bağımlılıkların isteğe bağlı olmasını sağlar.
-Nesnenin oluşturulması ve bağımlılığın enjekte edilmesi ayrı ayrı gerçekleşir.
-Birden fazla bağımlılığın olduğu durumlarda kullanılabilir.

Dezavantajları:
-Bağımlılıkların açık bir şekilde ifade edilmediği için kodun anlaşılabilirliği azalabilir.
-Nesnenin durumu (state) değiştirilebilir, bu da istenmeyen yan etkilere neden olabilir.
-Herhangi bir bağımlılığın isteğe bağlı olması, hataya yol açabilecek durumları da beraberinde getirebilir.

 */

 public class Test {

    public static void main(String[] args) {
        Character warrior = new Warrior();
        Game game = new Game();
        game.setCharacter(warrior);
        game.switchCharacter();
        game.useSpecialAbility();
    }

}
