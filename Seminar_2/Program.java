// Реализовать абстрактный класс Animal и его наследники Cat, 
// Dog, и прочее. Родитель имеет в себе общие данные 
// (пример: кличка, количествор лап, какие звуки издают и тд),
//  а наследники собственные параметры (тип перемещения).

// Создать класс Zoo, и организовать перекличку животных. 
// Теперь создать объект радио, и подумать, как его включить в
// объект Zoo.

// Организовать интерфейс работы с классами животных (и не 
// только), с методом Speek
// Реорганизовать работу классов с новым интерфейсом.
// Продумать, как можно задать животным скорость бега и 
// скорость полета.



package Seminar_2;

public class Program {
    
    public static void main(String[] args) {
        
        Zoo zoo = new Zoo();
        System.out.println("speak");
        zoo.talk();
        System.out.println("run");
        zoo.run();
        System.out.println("fly");
        zoo.fly();
        System.out.println("swim");
        zoo.swim();
    }
    
}
