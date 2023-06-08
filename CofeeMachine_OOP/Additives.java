package OOP.CofeeMachine_OOP;


public class Additives extends Product {
    private String additivesType;
    private int additivesQuantity;

    public Additives(String productName, double productPrice, String additivesType, int additivesQuantity) {
        super(productName, productPrice);
        this.additivesType = additivesType;
        this.additivesQuantity = additivesQuantity;
    }

    @Override
    public String toString() {
        return String.format("Добавки: %s, Тип: %s, Количество: %d", super.toString(), additivesType,
                additivesQuantity);
    }
}
