package _5_dependency_injection.interface_injection;

/* 
Interface Injection (Ara Yüz Enjeksiyonu) Örneği:

Örnek Senaryo: 
    Bir yazılım geliştiriyorsunuz ve farklı veritabanı sağlayıcılarıyla çalışabilen bir 
    veritabanı yönetim sistemi oluşturmanız gerekiyor. 
    Sistem, kullanılacak veritabanı sağlayıcısını çalışma zamanında dinamik olarak belirlemelidir.

Bu örnekte, DatabaseProvider arayüzü, veritabanı bağlantısı ve bağlantıyı sonlandırma gibi operasyonları tanımlar. 
OracleDatabaseProvider ve MySQLDatabaseProvider sınıfları, bu arayüzü uygular ve farklı veritabanı sağlayıcılarını temsil eder.

DatabaseManager sınıfı, DatabaseProvider bağımlılığını ara yüz enjeksiyonu yöntemiyle alır. 
Bu sayede, çalışma zamanında hangi veritabanı sağlayıcısının kullanılacağı belirlenebilir.

Main sınıfında, MySQLDatabaseProvider bir DatabaseProvider uygulaması olarak oluşturulur ve 
bu sağlayıcı DatabaseManager nesnesiyle birlikte kullanılır.

Avantajları:
-Birden fazla bağımlılığın aynı anda sağlanabilmesini sağlar.
-Nesnenin oluşturulması ve bağımlılığın enjekte edilmesi ayrı ayrı gerçekleşir.
-Bağımlılıkların daha esnek olmasını sağlar.

Dezavantajları:
-Arayüzlerin oluşturulması ve kullanılması gereklidir, bu da ek bir karmaşıklık getirebilir.
-Diğer enjeksiyon yöntemlerine kıyasla daha az tercih edilir ve daha karmaşık bir yapı gerektirebilir.
 */

  

public class Test {

    public static void main(String[] args) {
        DatabaseProvider mysqlProvider = new MySQLDatabaseProvider();
        DatabaseManager databaseManager = new DatabaseManager();
        databaseManager.setDatabaseProvider(mysqlProvider);
        databaseManager.performDatabaseOperations();
    }

}

