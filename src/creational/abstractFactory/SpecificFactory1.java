package creational.abstractFactory;

// Создадим реализацию абстрактной фабрики для создания продуктов семейства 1
public class SpecificFactory1 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new SpecificProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new SpecificProductB1();
    }
}
