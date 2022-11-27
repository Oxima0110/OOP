package Cernovik;

import java.util.Iterator;

public class ColourList<T> implements Iterable<T> {

    private class Colour<T> {

        private T unit;
        private Colour<T> next = null;

        Colour() {}

        Colour(T unit) {
            setUnit(unit);
        }

        public void setUnit(T unit) {
            this.unit = unit;
        }

        void addUnit(T unit) {
            if (isNext()) {
                next.addUnit(unit);
            } else {
                next = new Colour<>(unit);
            }
        }

        T get() {
            return unit;
        }

        boolean isNext() {
            return next != null;
        }

    }


    private Colour<T> colour = null;
    int count = 0;

    public ColourList() {
        colour = new Colour<>();
    }

    public int size() {
        return count;
    }

    public void add(T unit) {
        if (count == 0) {
            colour.setUnit(unit);
        } else {
            colour.addUnit(unit);
        }
        count++;
    }

    @Override
    public Iterator<T> iterator() {
        return new ColourIterator(colour);
    }
    private class ColourIterator implements Iterator<T> {

        private Colour<T> current;

        private boolean isFirst = true;

        ColourIterator(Colour<T> colour) {
            current = colour;
        }

        @Override
        public boolean hasNext() {
            if (count == 1 && isFirst)
                return true;
            return current.isNext();
        }

        @Override
        public T next() {
            if (isFirst)
                isFirst = false;
            else
                current = current.next;
            return current.get();
        }

    }

}
