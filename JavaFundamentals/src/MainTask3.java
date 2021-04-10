//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MainTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int num = Integer.parseInt(reader.readLine());
        int[] myArray = new int[num];
        System.out.print("Вывод случайных числе без перехода на новую строку: ");
            for (int i = 0; i<num; i++){
                myArray[i] = random.nextInt();
                System.out.print(myArray[i] +" ");
            }
        System.out.println("\n" +"Вывод случайных числе с переходом на новую строку: ");
        for (int i = 0; i<num; i++){
            myArray[i] = random.nextInt();
            System.out.println(myArray[i]);
        }


        }
            }
