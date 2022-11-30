package Seminar_4;

public class PowerShield implements Shield {

    @Override
    public Integer protect() {
        return 6;
    }

    @Override
    public String toString() {
        return String.format("ElfShield - %d", protect());
    }
}
