public class Student extends Person{

    private int enrollment;
    private String course;

    public Student(String name, int age, String gender, int enrollment, String course) {
        super(name, age, gender);
        this.setEnrollment(enrollment);
        this.setCourse(course);
    }

    public int getEnrollment() {
        return enrollment;
    }
    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public void montlyPayment() {
        System.out.println("Montly payment successfully processed");
    }
}
