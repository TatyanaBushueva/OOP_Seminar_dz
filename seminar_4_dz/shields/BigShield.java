package OOP.seminar_4_dz.shields;



public class BigShield implements Shield {
    @Override
    public int block() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("BigShield: %d ", block());
    }
}
