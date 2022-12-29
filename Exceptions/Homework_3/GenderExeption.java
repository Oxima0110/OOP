package Exceptions.Homework_3;

public class GenderExeption extends RuntimeException{
    
    public GenderExeption() {
        super("Неверно введен пол");
    }
}
