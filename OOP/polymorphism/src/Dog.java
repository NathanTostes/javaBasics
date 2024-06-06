public class Dog extends Mammal{

    @Override
    public void sound() {
        System.out.println("Barking...");
    }

    public void buryBone(){
        System.out.println("Burying a bone...");
    }
    public void waggingTail() {
        System.out.println("Wagging the tail...");
    }
}