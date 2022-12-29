package Exceptions.Homework_3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        while (true) {

            try {
                String[] user = getUser();
                fio(user[0]);
                fio(user[1]);
                fio(user[2]);
                data(user[3]);
                gender(user[4]);
                telephoneNum(user[5]);
                saveUser(user);
                break;

            } catch (DateTimeParseException e) {
                System.out.println("Неверный формат даты");
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат номера телефона");
            }
        }

    }

    public static String[] getUser() {
        System.out.println("Введите ваши данные в формате: Фамилия Имя Очество Дата_рождения " +
                "Пол(f или m) Номер_Телефона. При вводе все данные разделяются пробелом.");
        Scanner scanner = new Scanner(System.in);
        String[] user = scanner.nextLine().split(" ");
        // String str = "Ivanov Petr Vasilievich 22.12.2000 m 771252";
        // String[] temp = str.split(" ");
        if (user.length > 6) {
            throw new MoreException();
        }
        if (user.length < 6) {
            throw new LessException();
        }
        // System.out.println(Arrays.asList(temp));
        scanner.close();
        return user;
    }

    public static void fio(String temp) throws FIOException {
        temp = temp.replace(" ", "");
        if (temp.isEmpty()) {
            throw new FIOException();
        }
    }

    public static void data(String temp) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(temp, formatter);
    }

    public static void gender(String temp) throws GenderExeption {
        if (!temp.equals("m") && !temp.equals("f")) {
            throw new GenderExeption();
        }
    }

    public static void telephoneNum(String temp) throws NumberFormatException {
        Integer.parseInt(temp);
    }

    public static void saveUser(String[] user) {
        String name = user[0];
        String fileName = "E:\\OOP\\Exceptions\\Homework_3\\" + name + ".txt";
        System.out.println(fileName);
        String result = "";
        for (String item : user) {
            result = result + "<" + item + ">";
        }
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(result);
            writer.append('\n');
            writer.flush();
            System.out.println("Ваши данные записаны");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода:" + ex);
        }

    }

}
