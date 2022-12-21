package Exceptions.Homework_02;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. Пользователю 
// должно показаться сообщение, что пустые строки вводить 
// нельзя.
public class task_04 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.nextLine();
        scan.close();
        if (str.isEmpty()) {
            throw new RuntimeException("Пустую строку вводить нельзя!");
        }
        System.out.printf("Ваша строка: %s", str);
    }
}
