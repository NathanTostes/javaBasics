public class Mammal extends Animal{
    private String furColor;

    public String getFurColor(){
        return this.furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
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
        System.out.println("Roaring...");
    }
}
