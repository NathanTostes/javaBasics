public class Car {

    String model;
    String color;
    int kmTraveled;
    int kmHour;
    float tankPercentage;
    boolean open;

    void status() {
        System.out.println(
            "Model: " + this.model + "\n" +
            "Color: " + this.color + "\n" +
            "Tank(%): " + this.tankPercentage + "\n" +
            "Km per Hour: " + this.kmHour + "\n" +
            "Open: " + this.open + "\n"

        );
    }

    void open() {
        this.open = true;
    }

    void close() {
        this.open = false;
    }

    void refuel(float qtd) {
        this.tankPercentage = this.tankPercentage + qtd;
    }

    void acelerate(int speed) {
        float lessPercentage = (float) speed / 100;
        this.tankPercentage = this.tankPercentage - lessPercentage;
        this.kmHour = this.kmHour + speed;
    }

    void brake(int speed) {
        this.kmHour = this.kmHour - speed;
    }

}