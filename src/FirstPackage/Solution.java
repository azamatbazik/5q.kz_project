package FirstPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    //    Объект для ввода информации через консоль
    private Object bufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    //    Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел
    private static String mathCalculated(float a, float b, char operation) {
        float result = 0f;
        String valueResults;
        switch (operation) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                valueResults = "Invalid operation";
        }
        valueResults = String.valueOf(result);
        return valueResults;
    }

    //    Метод для ввода информации через консоль
    public String showMathResult() throws IOException {
        float a = Float.parseFloat((String) bufferedReader());
        float b = Float.parseFloat((String) bufferedReader());
        String operation = (String) bufferedReader();
        char o = operation.charAt(0);
        return Solution.mathCalculated(a, b, o);
    }

    //    Напишите программу для вывода нечетных чисел от 1 до 20
    public void oddNumber() throws IOException {
        int firstNumber = Integer.parseInt((String) bufferedReader());
        int secondNumber = Integer.parseInt((String) bufferedReader());
        int value = 0;
        for (int i = firstNumber; i < secondNumber; i++, value++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //    Напишите программу, чтобы поменять местами две переменные
    public void replaceObject() throws IOException {
        Object firstValue = bufferedReader();
        Object secondValue = bufferedReader();
        Object thirdValue = secondValue;
        secondValue = firstValue;
        firstValue = thirdValue;
        System.out.println("First value is - " + firstValue);
        System.out.println("Second value is - " + secondValue);
    }

    //      Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них
    public float bigValue() throws IOException {
        float a = Float.parseFloat((String) bufferedReader());
        float b = Float.parseFloat((String) bufferedReader());
        float c = Float.parseFloat((String) bufferedReader());
        float result = 0;
        if (a > b && b > c) {
            result = a;
        } else if (a > b && a < c) {
            result = c;
        } else {
            result = b;
        }
        return result;
    }

    //    Напишите программу для проверки того, является ли число положительным или отрицательным
    public String positiveOrNegative() throws IOException {
        float a = Float.parseFloat((String) bufferedReader());
        String result = null;
        if (a > 0) {
            result = "Positive number";
        } else {
            result = "Negative number";
        }
        return result;
    }

    //    Напишите программу для замены всех символов 'a' на символы 'b'
    public String replaceValue() throws IOException {
        String value = (String) bufferedReader();
        char a = ((String) bufferedReader()).charAt(0);
        char b = ((String) bufferedReader()).charAt(0);
        return value.replace(a, b);
    }

    //Напишите программу для суммирования значений массива
    public Float sumValueArray() throws IOException {
        int arrayLength = Integer.parseInt((String) bufferedReader());
        float[] value = new float[arrayLength];
        float result = 0;
        for (int i = 0; i < arrayLength; i++) {
            value[i] = Float.parseFloat((String) bufferedReader());
            result += value[i];
        }
        return result;
    }

    //Напишите программу для нахождения второго по величине числа из массива
    public Object secondBigValue() throws IOException {
        int arrayLength = Integer.parseInt((String) bufferedReader());
        float[] array = new float[arrayLength];
        if (arrayLength < 2) {
            System.out.println("Внутри массива 1 элемент");
            return null;
        } else {
            for (int i = 0; i < arrayLength; i++) {
                array[i] = Float.parseFloat((String) bufferedReader());
            }
            Arrays.sort(array);
        }
        return array[arrayLength - 2];
    }
}
