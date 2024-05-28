import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static final String LOG_FILE = "LogDatabyte.log";

    public static void log(String mensagem) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(mensagem);
        } catch (IOException e) {
            e.printStackTrace(); // Em um sistema real, lidaria com isso de outra forma.
        }
    }
}
