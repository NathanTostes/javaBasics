public abstract class Animal {
    private float wheight;
    private int age;
    private int limbs;

    public float getWheight() {
        return wheight;
    }
    public void setWheight(float wheight) {
        this.wheight = wheight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getLimbs() {
        return limbs;
    }
    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    @Override
    public String toString() {
        return "Animal [wheight=" + wheight + ", age=" + age + ", limbs=" + limbs + "]\n";
    }
    
    public abstract void move();
    public abstract void eat();
    public abstract void sound();
}