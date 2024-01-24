public class Dog {
    private String name;
    private int age;
    private float wheight;

    public Dog(String name, int age, float wheight) {
        this.setName(name);
        this.setAge(age);
        this.setWheight(wheight);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getWheight() {
        return wheight;
    }
    public void setWheight(float wheight) {
        this.wheight = wheight;
    }

    public void reaction(String reaction) {
        System.out.println("Wagging the tail...");
    }
    public void reaction(int hour) {
        if (hour >= 6 && hour <= 14) System.out.println("Playing around...");
        else if (hour > 14 && hour <= 20) System.out.println("Ignore");
        else if (hour < 24 || hour > 0) System.out.println("Bite");
        else System.out.println("Invalid hour");
    }
    public void reaction(boolean owner) {
        if (owner) System.out.println("Wagging the tail...");
        else System.out.println("Barking...");
    }
    public void reaction() {
        if (this.getAge() <= 10) System.out.println("Playing around...");
        else System.out.println("Ignore");
    }
}
