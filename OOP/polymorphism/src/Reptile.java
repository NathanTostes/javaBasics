public class Reptile extends Animal{
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }
    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void move() {
        System.out.println("Walking...");
    }
    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sound() {
        System.out.println("Grunting...");
    }

    
}
