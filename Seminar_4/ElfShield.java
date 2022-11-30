package Seminar_4;

public class ElfShield implements Shield {

    @Override
    public Integer protect() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("ElfShield - %d", protect());
    }
    
    
}
