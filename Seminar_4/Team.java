package Seminar_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {

    private Hero hero;

    private List<T> teamlist = new ArrayList<>();

    public Team(Hero hero) {
        this.hero = hero;
    }

    public void add(T pers) {
        teamlist.add(pers);
    }

    @Override
    public Iterator<T> iterator() {
        return teamlist.iterator();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(hero.toString() + "\n");
        for (T item : this) {
            builder.append(item.toString() + "\n");
        }
        return builder.toString();
    }

    public Integer getTeamHealthPoit() {
        int summ = hero.getHealthPoint();
        for (T item : this) {
            summ += item.getHealthPoint();
        }
        return summ;
    }
}