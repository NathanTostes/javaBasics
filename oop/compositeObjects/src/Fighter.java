public class Fighter implements FighterInterface{
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

    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private String getNacionality() {
        return nacionality;
    }
    private void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    private int getAge() {
        return age;
    }
    private void setAge(int age) {
        this.age = age;
    }
    private float getHeight() {
        return height;
    }
    private void setHeight(float height) {
        this.height = height;
    }
    private float getWeight() {
        return weight;
    }
    private void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }
    private String getCategory() {
        return category;
    }
    private void setCategory() {
        if (this.getWeight() < 52.2) this.category = "Invalid";
        else if (this.getWeight() <= 70.3) this.category = "Light";
        else if (this.getWeight() <= 83.9) this.category = "Medium";
        else this.category = "Heavy";
    }
    private int getWins() {
        return wins;
    }
    private void setWins(int wins) {
        this.wins = wins;
    }
    private int getLosses() {
        return losses;
    }
    private void setLosses(int losses) {
        this.losses = losses;
    }
    private int getDraws() {
        return draws;
    }
    private void setDraws(int draws) {
        this.draws = draws;
    }

    @Override
    public void show() {
        System.out.println(
            "- - - Showing Fighter - - -\n" +
            "This is the " + this.getNacionality() + " fighter " + this.getName() + "\n" +
            "He has " + this.getWins() + " wins, " + this.getLosses() + " losses and " + this.getDraws() + " draws"
        );
    }

    @Override
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

    @Override
    public void winCombat() {
        this.setWins(this.getWins() + 1);
    }

    @Override
    public void loseCombat() {
        this.setLosses(this.getLosses() + 1);
    }

    @Override
    public void drawCombat() {
        this.setDraws(this.getDraws() + 1);
    }
    
}