// Реализовать абстрактный класс Warrior, с полями name, 
// weapon, healthPoint
// Создать интерфейс Weapon с методом damage(), который 
// будет показывать наносимый урон
// На основе класса Warrior создать различные типы воинов, 
// например, лучник, меченосец, ополченец и т.п. У лучника 
// добавить поле расстояние поражения. 
// Создать различные виды вооружения, например, меч, лук, 
// лопата. Обеспечить, чтобы определенный тип воина мог 
// нести только определенной оружие
// Создать класс командира

// Создать команду, которая будет содержать командира и 
// обобщенный тип воинов, только лучников, меченосцев, всех 
// подряд, но только унаследованных от Warrior
// Создать итератор на класс команды, который перебирает всех 
// участников команды
// Написать методы (подумать куда их можно вставить), которые 
// определяют сумму поражений от всех участников, сумму 
// healthPoint и максимальное расстояние поражения. Если в 
// команде нет лучников, то расстояние поражения считать 
// равным 0.

package Seminar_4;

public abstract class Warrior<T, E> {

    private String name;
    private int healthPoint;
    private T weapon;
    private E shield;

    public Warrior(String name, int healthPoint, T weapon, E shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public Warrior(String name, int healthPoint, T weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public E getShield() {
        return shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        if (this.shield == null) {
            return String.format("%s, %s, health - %d", getName(), getWeapon(), getHealthPoint());
        }
        return String.format("%s, %s, %s, health - %d", getName(), getWeapon(), getShield(), getHealthPoint());
    }
}
