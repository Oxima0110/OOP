package Seminar_4;

// import lectia_1.Ex006.Teams;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Робин Гуд", 150, new Staff(), new SuperShield());
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Анайрэ", 100, new LongBow(), new ElfShield(), 10));
        red.add(new Archer("Феанор", 100, new Bow(), 10));
        red.add(new Archer("Трандуил", 100, new Bow(), new ElfShield(), 10));

        Hero hero2 = new Hero("Дамблдор", 150, new Staff());
        Team<Mage> green = new Team<>(hero2);
        green.add(new Mage("Волан-де-Морт", 80, new Staff(), 15, 100));
        green.add(new Mage("Драко Малфой", 80, new Staff(), new PowerShield(), 15, 100));
        green.add(new Mage("Гарри Поттер", 80, new Staff(), new PowerShield(), 15, 100));

        Hero hero3 = new Hero("Человек паук", 150, new Staff(), new SuperShield());
        Team<Warrior> gold = new Team<>(hero3);
        gold.add(new Mage("Халк", 80, new Staff(), new PowerShield(), 15, 100));
        gold.add(new Archer("Чудо Женщина", 80, new Bow(), new ElfShield(), 100));
        gold.add(new Mage("Росомаха", 80, new Staff(), 15, 100));

        System.out.println(red);
        System.out.println(green);
        System.out.println(gold);
        System.out.println(green.getTeamHealthPoit());
    }
}