public class Fighter {
    private String name;
    private String nacionality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins;
    private int losses;
    private int draws;

    public Fighter(String newName, String newNacionality, int newAge, float newHeight, float newWeight, int newWins, int newLosses, int newDraws) {
        this.setName(newName);
        this.setAge(newAge);
        this.setNacionality(newNacionality);
        this.setAge(newAge);
        this.setHeight(newHeight);
        this.setWeight(newWeight);
        this.setWins(newWins);
        this.setLosses(newLosses);
        this.setDraws(newDraws);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNacionality() {
        return nacionality;
    }
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }
    public String getCategory() {
        return category;
    }
    public void setCategory() {
        if (this.getWeight() < 52.2) this.category = "Invalid";
        else if (this.getWeight() <= 70.3) this.category = "Light";
        else if (this.getWeight() <= 83.9) this.category = "Medium";
        else if (this.getWeight() <= 120.3) this.category = "Heavy";
        else this.category = "Invalid";
    }
    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    public int getLosses() {
        return losses;
    }
    public void setLosses(int losses) {
        this.losses = losses;
    }
    public int getDraws() {
        return draws;
    }
    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void show() {
        System.out.println(
            "- - - Showing Fighter - - -\n" +
            "This is the " + this.getNacionality() + " fighter " + this.getName() + "\n" +
            "He has " + this.getWins() + (this.getWins() <= 1 ? " win, " : " wins, ") + 
            this.getLosses() + (this.getLosses() <= 1 ? " lose and " : " losses and ") + 
            this.getDraws() + (this.getDraws() <= 1 ? " draw" : " draws")
        );
    }

    public void status() {
        System.out.println(
            "- - - Fighter Status - - -\n" +
            "Name: " + this.getName() + "\n" +
            "Age: " + this.getAge() + "\n" +
            "Height: " + this.getHeight() + "m\n" +
            "Weight: " + this.getWeight() + "Kg\n" +
            "Category: " + this.getCategory() + "\n"
        );
    }

    public void winCombat() {
        this.setWins(this.getWins() + 1);
    }

    public void loseCombat() {
        this.setLosses(this.getLosses() + 1);
    }

    public void drawCombat() {
        this.setDraws(this.getDraws() + 1);
    }
    
}