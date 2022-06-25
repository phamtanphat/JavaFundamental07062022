public class Cat extends Animal{
    private String background;

    public Cat(float weigh, float height, boolean isHerbivore, String background) {
        super(weigh, height, isHerbivore);
        this.background = background;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public void printCategory() {
        System.out.println("Cat category");
        super.printCategory();
    }
}
