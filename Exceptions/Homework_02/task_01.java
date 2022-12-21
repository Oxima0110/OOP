package Exceptions.Homework_02;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя 
// ввод дробного числа (типа float), и возвращает введенное 
// значение. Ввод текста вместо числа не должно приводить к 
// падению приложения, вместо этого, необходимо повторно 
// запросить у пользователя ввод данных.

public class task_01 {
    public static void main(String[] args) {
        System.out.printf("Дробное число: %.2f", getDouble());

    }

    public static double getDouble() {
        double num = 0f;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            if (sc.hasNextDouble()) {
                num = sc.nextDouble();
                break;
            } else {
                System.out.println("Это не дробное число.");
            }
        }
        return num;
    }
}
