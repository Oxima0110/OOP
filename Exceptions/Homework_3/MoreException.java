package Exceptions.Homework_3;

public class MoreException extends RuntimeException{
    
    public MoreException() {
        super("Вы ввели больше данных");
    }
}
