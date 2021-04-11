//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Enter the month number from 1 to 12");

        String[] month = {"January", "February ", "March ", "April ", "May ", "June ",
                "July ", "August ", "September ", "October ", "November ", "December "};
        String s;
        try {
            s = month[num - 1];
            System.out.println("This is the month of  " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Number entered incorrectly");
        }
    }


}


