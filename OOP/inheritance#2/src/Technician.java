public class Technician extends Student{
    private int professionalRegister;

    public Technician(String name, int age, String gender, int enrollment, String course) {
        super(name, age, gender, enrollment, course);
    }

    public int getProfessionalRegister() {
        return professionalRegister;
    }
    public void setProfessionalRegister(int professionalRegister) {
        this.professionalRegister = professionalRegister;
    }

    public void practice() {
        System.out.println("Technical practice");
    }
}
