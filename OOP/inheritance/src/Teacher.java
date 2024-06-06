public class Teacher extends Person {
    private String specialty;
    private float salary;

    public Teacher(String newName, int newAge, String newGender, String newSpecialty, float newSalary) {
        super(newName, newAge, newGender);
        this.setSpecialty(newSpecialty);
        this.setSalary(newSalary);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void status() {
        System.out.println(
            "\nName: " + this.getName() +
            "\nAge: " + this.getAge() +
            "\nGender: " + this.getGender() +
            "\nSpecialty: " + this.getSpecialty() +
            "\nSalary: " + this.getSalary()
        );
    }
    public void salaryIncrease(float increase) {
        this.setSalary(getSalary() + increase);
    }
}
