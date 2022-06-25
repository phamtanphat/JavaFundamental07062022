public class Animal {
    // properties: thuộc tính hiển thị thông tin đối tượng
    float weigh;
    float height;
    boolean isHerbivore;

    // constructor: phương thức khởi tạo
    public Animal(float weigh, float height, boolean isHerbivore) {
        this.weigh = weigh;
        this.height = height;
        this.isHerbivore = isHerbivore;
    }

    // function : hành vi
    public void eat() {
        if (isHerbivore) {
            System.out.println("Động vật ăn cỏ");
        } else {
            System.out.println("Động vật ăn thịt");
        }
    }
}
