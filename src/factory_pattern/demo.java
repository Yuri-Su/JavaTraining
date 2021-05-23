package factory_pattern;

public class demo {
    public static void main(String[] args) {
        IFactory factory = new FactoryImpl();
        IProduct product = factory.createProduct();
        product.productMethod();
    }

}
