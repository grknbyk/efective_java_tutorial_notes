package _5_dependency_injection.constructor_injection;

/* 
Constructor Injection (Yapıcı Enjeksiyon) Örneği:

    Örnek Senaryo: Bir restoranın sipariş alma sistemi üzerinde çalışıyorsunuz. 
Restoran, farklı ödeme yöntemlerini desteklemektedir ve siparişlerin ödeme işlemi gerçekleştirilirken 
hangi ödeme yönteminin kullanılacağı dinamik olarak belirlenmelidir.

 Bu örnekte, PaymentMethod arayüzü, ödeme işlemlerini gerçekleştiren pay() metodunu tanımlar. 
 CreditCardPayment ve CashPayment sınıfları, bu arayüzü uygular ve farklı ödeme yöntemlerini temsil eder.

Order sınıfı, PaymentMethod bağımlılığını yapıcı enjeksiyon yöntemiyle alır. 
Bu sayede, her bir siparişin ödeme işlemi gerçekleştirilirken kullanılacak ödeme yöntemi belirlenebilir.

Main sınıfında, CreditCardPayment bir PaymentMethod uygulaması olarak oluşturulur ve 
bu ödeme yöntemi Order nesnesiyle birlikte kullanılır.

Avantajları:
-Bağımlılık açıkça ifade edildiği için kodun anlaşılabilirliği artar.
-Nesnenin durumu (state) değişmez, yani bir kez enjekte edilen bağımlılık sonradan değiştirilemez.
-Bağımlılıkların zorunlu olduğu durumlarda kullanılabilir.

Dezavantajları:
-Nesnenin oluşturulması için tüm bağımlılıkların bir arada sağlanması gerekmektedir, bu bazen karmaşık olabilir.
-Birden fazla bağımlılığın olduğu durumlarda yapıcı parametreleri artabilir, bu da okunabilirliği azaltabilir.
 */


public class Test {
    
    public static void main(String[] args) {
        PaymentMethod method = new CreditCardPayment();
        Order order = new Order(method);
        order.processPayment(50.0);
    }

}