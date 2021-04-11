//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask4 {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int sum =0;
    int mul =1;
        System.out.println("Enter array length: ");
        int size = Integer.parseInt(reader.readLine());
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
        array[i] = Integer.parseInt(reader.readLine());
        }
                for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of entered numbers = " + sum);

        for (int i = 0; i < array.length; i++) {
            mul = mul * array[i];
        }
        System.out.println("Multiplication of entered numbers = " + mul);
    }
}
