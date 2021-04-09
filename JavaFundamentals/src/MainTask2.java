//Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }

}
