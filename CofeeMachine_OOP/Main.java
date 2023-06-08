package OOP.CofeeMachine_OOP;


public class Main {
    public static void main(String[] args) {

        CofeeMachine apparat = new CofeeMachine();
        apparat.addProduct(new Additives("Сахар", 10,
                "белый", 1))
                .addProduct(new Product("Чай черный", 50))
                .addProduct(new Product("Кола", 150))
                .addProduct(new Cofee("Американо", 100, "крепкий", 250, 50))
                .addProduct(new Cofee("Капучино", 200, "молочный", 300, 60));

        System.out.println(apparat);
        Product product = apparat.findProduct("Капучино");
        System.out.println(product);

        System.out.println("+++++++++++++++++++++");
        Product saledProduct = apparat.saleProduct("Капучино");
        System.out.println(saledProduct);
        Product saledProduct2 = apparat.saleProduct("Кола");
        System.out.println(saledProduct2);
        System.out.println(apparat);

    }
}
