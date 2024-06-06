public final class Teacher extends Person{
    private String specialty;
    private float salary;

    public Teacher(String name, int age, String gender, String specialty, float salary) {
        super(name, age, gender);
        this.setSpecialty(specialty);
        this.setSalary(salary);
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

    public void increaseSalary(int bonus) {
        this.setSalary(this.getSalary() + bonus);
    }
}
