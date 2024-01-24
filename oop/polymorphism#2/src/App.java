public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog("Rosa", 3, 15.7f);
        
        dog1.reaction();
        dog1.reaction(false);
        dog1.reaction(21);
        dog1.reaction("Hello");
    }
}
