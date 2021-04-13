/*Задание. Ввести n чисел с консоли.
        1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        2.     Вывести числа в порядке возрастания (убывания) значений их длины.
        3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
        5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
        6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.*/

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_1 {
    public static void main(String[] array) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[]arr = new String[size];
        for(int i = 0;i<size;i++){
            arr[i]=scan.next();
        }
        solve(arr);
    }
    public static void solve(String[]arr){
        int min = arr[0].length();
        int max = 0;
        for(String val:arr){
            if(val.length()>max)max=val.length();
            else if(val.length()<min)min=val.length();
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i].length()==max)System.out.println("Max number is "+arr[i]+" his length "+arr[i].length());
            else if(arr[i].length()==min)System.out.println("Min number is "+arr[i]+" his length "+arr[i].length());
        }
    }
}

