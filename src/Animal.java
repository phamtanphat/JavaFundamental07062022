public class Animal {
    // properties: thuộc tính hiển thị thông tin đối tượng
    private float weigh;
    private float height;
    private boolean isHerbivore;

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

    // getter va setter : lấy và cập nhật thuộc tính
    public float getWeigh() {
        return weigh;
    }

    public void setWeigh(float weigh) {
        this.weigh = weigh;
    }
}
