public class Bird extends Animal{
    private String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }
    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void move() {
        System.out.println("Flying");
    }
    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sound() {
        System.out.println("Bird Songs");
    }
    public void buildingNest() {
        System.out.println("Building a Nest...");
    }
}