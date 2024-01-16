public class Shirt {

    String color;
    String material;
    int size;
    boolean dress;

    void status() {
        System.out.println(
            "Color: " + this.color + "\n" +
            "Material: " + this.material + "\n" +
            "Size: " + this.size + "\n" +
            "Dress: " + this.dress + "\n"
        );
    }

    void toDress() {
        dress = true;
    }

    void takeOffShirt() {
        dress = false;
    }

}