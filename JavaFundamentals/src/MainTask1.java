import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

// Приветствовать любого пользователя при вводе его имени через командную строку.
public class MainTask1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your name.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String username = reader.readLine();
        System.out.println("Hello " + username + "!");

    }
}
