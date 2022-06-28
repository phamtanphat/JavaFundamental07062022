package abstractions;

public class PizzaChicken extends Pizza{

    @Override
    void prepare() {
        System.out.println("PizzaChicken: prepare");
    }

    @Override
    void sauce() {
        System.out.println("PizzaChicken: sauce");
    }

    @Override
    void bake() {
        System.out.println("PizzaChicken: bake");
    }

    @Override
    void cut() {
        System.out.println("PizzaChicken: cut");
    }

    @Override
    void box() {
        System.out.println("PizzaChicken: box");
    }
}
