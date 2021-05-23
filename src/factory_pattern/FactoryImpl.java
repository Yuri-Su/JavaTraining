package factory_pattern;

public class FactoryImpl implements IFactory{

    @Override
    public IProduct createProduct() {
        // TODO Auto-generated method stub
        return new ProductImpl();
    }

 }