package OOP.seminar_4_dz.shields;

public class SmallShield implements Shield {
    @Override
    public int block() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("SmallShield: %d ", block());
    }
}
