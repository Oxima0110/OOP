package Exceptions.Homework_3;

public class FIOException extends RuntimeException{

    public FIOException() {
        super("Неверно введено ФИО");
    }
}
