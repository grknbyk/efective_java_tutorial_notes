package _5_dependency_injection.interface_injection;

public class MySQLDatabaseProvider implements DatabaseProvider {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }
}
