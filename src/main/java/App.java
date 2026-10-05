import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void dangerous(String userInput) throws Exception {        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement stmt = conn.createStatement();        stmt.execute("SELECT * FROM users WHERE name = '" + userInput + "'");
    }

    public static String hardcodedSecret() {        String password = "super-secret-password";
        return password;
    }

    public static void runCmd(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
    }
}