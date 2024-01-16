public class Bottle {

    public String color;
    public String material;
    private float capacity;
    protected float height;
    private boolean covered;

    public void status() {
        System.out.println(
            "Color: " + this.color + "\n" +
            "Material: " + this.material + "\n" +
            "Capacity: " + this.capacity + "\n" +
            "Height: " + this.height + "\n" +
            "Covered: " + this.covered
        );
    }
    public void open() {
        this.covered = false;
    }
    public void close() {
        this.covered = true;
    }
}