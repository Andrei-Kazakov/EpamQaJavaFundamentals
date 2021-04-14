import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OptionalTask1_1 {
  //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] array) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        System.out.println("Insert array elements:");
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.next();
        }
        solve(arr);
    }

    public static void solve(String[] arr) {
        int min = arr[0].length();
        int max = 0;
        for (String val : arr) {
            if (val.length() > max) max = val.length();
            else if (val.length() < min) min = val.length();
        }
        for (String s : arr) {
            if (s.length() == max)
                System.out.println("Max number is " + s + " his length " + s.length());
            else if (s.length() == min)
                System.out.println("Min number is " + s + " his length " + s.length());
        }
        //Вывести числа в порядке возрастания (убывания) значений их длины.
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println("Numbers in ascending order of their lengths: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Numbers in descending order of their lengths: ");
        System.out.println(Arrays.toString(arr));
    }
}

