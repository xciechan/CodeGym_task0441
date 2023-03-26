package pl.codegym.task.task04.task0441;

import java.io.*;

/**
 Created by xciechan
 on 2023-03-27

 The application sorts numbers and print middle number.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        int amountNumbers = 3;
        printMiddleNumber(bubbleSort(enterNumbers(amountNumbers),amountNumbers));
    }

    public static int[] enterNumbers(int amountNumbers) throws IOException {
        int[] arrayNumber = new int[amountNumbers];
        for (int i = 0; i < amountNumbers; i++){
            arrayNumber[i] = readNumber();
        }
        return  arrayNumber;
    }

    public static int readNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());

        return number;
    }

    public static int[] bubbleSort (int[] arrayNumber, int amountNumbers){
        int temp;
        int numbersChange;

        do {
            numbersChange = 0;
            for (int i = arrayNumber.length - 1; i > 0; i--) {
                if (arrayNumber[i] > arrayNumber[i - 1]) {
                    temp = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[i - 1];
                    arrayNumber[i - 1] = temp;

                    numbersChange = 1;
                }
            }
        }while (numbersChange != 0);

        return  arrayNumber;
    }

    public static void printMiddleNumber (int[] arrayNumber){
            System.out.println(arrayNumber[1]);
    }
}