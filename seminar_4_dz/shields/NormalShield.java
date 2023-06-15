package OOP.seminar_4_dz.shields;

public class NormalShield implements Shield {
    @Override
    public int block() {
        return 4;
    }

    @Override
    public String toString() {
        return String.format("NormalShield: %d ", block());
    }
}