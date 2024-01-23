public class Worker extends Person{
    private String sector;
    private boolean working;

    public Worker(String newName, int newAge, String newGender, String newSector) {
        super(newName, newAge, newGender);
        this.setSector(newSector);
        this.setWorking(false);
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
    
    public void status() {
        System.out.println(
            "\nName: " + this.getName() +
            "\nAge: " + this.getAge() +
            "\nGender: " + this.getGender() +
            "\nSector: " + this.getSector() +
            "\nWorking: " + this.isWorking()
        );
    }
    public void changeWork() {
        this.setWorking(!this.isWorking());
    }
}
