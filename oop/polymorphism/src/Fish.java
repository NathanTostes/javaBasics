public class Fish extends Animal{
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }
    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void move() {
        System.out.println("Swimming");
    }
    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sound() {
        System.out.println("No sound");
    }
    public void makeBubbles() {
        System.out.println("Making Bubbles...");
    }
}
