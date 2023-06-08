package OOP.CofeeMachine_OOP;


public class Cofee extends Product {
    private String cofeeType;
    private double volume;
    private double temperature;

    public Cofee(String productName, double productPrice, String cofeeType, double volume, double temperature) {
        super(productName, productPrice);
        this.cofeeType = cofeeType;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Кофе: %s, Тип: %s, Объем: %f, Температура: %f", super.toString(), cofeeType, volume,
                temperature);
    }
}
