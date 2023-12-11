package _5_dependency_injection.interface_injection;

public class OracleDatabaseProvider implements DatabaseProvider {
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");
    }
}
