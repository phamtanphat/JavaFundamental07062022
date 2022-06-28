package abstractions;

public class PizzaCheese extends Pizza{
    @Override
    void prepare() {
        System.out.println("PizzaCheese: prepare");
    }

    @Override
    void sauce() {
        System.out.println("PizzaCheese: sauce");
    }

    @Override
    void bake() {
        System.out.println("PizzaCheese: bake");
    }

    @Override
    void cut() {
        System.out.println("PizzaCheese: cut");
    }

    @Override
    void box() {
        System.out.println("PizzaCheese: box");
    }
}
