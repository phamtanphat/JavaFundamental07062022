package abstractions;

public class PizzaMeat extends Pizza{

    @Override
    void prepare() {
        System.out.println("PizzaMeat: prepare");
    }

    @Override
    void sauce() {
        System.out.println("PizzaMeat: sauce");
    }

    @Override
    void bake() {
        System.out.println("PizzaMeat: bake");
    }

    @Override
    void cut() {
        System.out.println("PizzaMeat: cut");
    }

    @Override
    void box() {
        System.out.println("PizzaMeat: box");
    }
}
