public class App {
    public static void main(String[] args) throws Exception {

        Arara arara = new Arara();
        Kangaroo kangaroo = new Kangaroo();
        Turtle ninjaTurtle = new Turtle();
        Dog dog = new Dog();

        arara.setWheight(5.4f);
        arara.setAge(3);
        arara.setLimbs(0);
        arara.setFeatherColor("Red");
        arara.move();
        arara.eat();
        arara.sound();
        arara.buildingNest();
        System.out.println(arara.toString());

        kangaroo.setWheight(42.7f);
        kangaroo.setAge(5);
        kangaroo.setLimbs(4);
        kangaroo.setFurColor("Brown");
        kangaroo.move();
        kangaroo.eat();
        kangaroo.sound();
        kangaroo.useBag();
        System.out.println(kangaroo.toString());

        ninjaTurtle.setWheight(3.2f);
        ninjaTurtle.setAge(2);
        ninjaTurtle.setLimbs(4);
        ninjaTurtle.setScaleColor("Green");
        ninjaTurtle.move();
        ninjaTurtle.eat();
        ninjaTurtle.sound();
        System.out.println(ninjaTurtle.toString());

        dog.setWheight(20.5f);
        dog.setAge(9);
        dog.setLimbs(4);
        dog.setFurColor("Brown");
        dog.move();
        dog.eat();
        dog.sound();
        dog.buryBone();
        dog.waggingTail();
        System.out.println(dog.toString());

        /*
        Mammal animal1 = new Mammal();
        Reptile animal2 = new Reptile();
        Fish animal3 = new Fish();
        Bird animal4 = new Bird();

        animal1.setWheight(42.7f);
        animal1.setAge(5);
        animal1.setLimbs(4);
        animal1.setFurColor("Brown");
        animal1.move();
        animal1.eat();
        animal1.sound();
        System.out.println(animal1.toString());

        animal2.setWheight(3.2f);
        animal2.setAge(2);
        animal2.setLimbs(4);
        animal2.setScaleColor("Green");
        animal2.move();
        animal2.eat();
        animal2.sound();
        System.out.println(animal2.toString());

        animal3.setWheight(5.4f);
        animal3.setAge(3);
        animal3.setLimbs(0);
        animal3.setScaleColor("Pink");
        animal3.move();
        animal3.eat();
        animal3.sound();
        animal3.makeBubbles();
        System.out.println(animal3.toString());

        animal4.setWheight(5.4f);
        animal4.setAge(3);
        animal4.setLimbs(0);
        animal4.setFeatherColor("Red");
        animal4.move();
        animal4.eat();
        animal4.sound();
        animal4.buildingNest();
        System.out.println(animal4.toString());
        */

    }
}
