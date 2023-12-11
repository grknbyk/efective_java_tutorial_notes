package _5_dependency_injection.interface_injection;

public class DatabaseManager {
    private DatabaseProvider databaseProvider;

    public void setDatabaseProvider(DatabaseProvider databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    public void performDatabaseOperations() {
        databaseProvider.connect();
        // ... diğer veritabanı işlemleri ...
        databaseProvider.disconnect();
    }
}
