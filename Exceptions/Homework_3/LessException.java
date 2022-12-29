package Exceptions.Homework_3;

public class LessException extends RuntimeException {
    
    public LessException() {
        super("Вы ввели не все данные");
    }
}
