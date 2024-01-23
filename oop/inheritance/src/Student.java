public class Student extends Person{
    private int enrollment;
    private String course;

    public Student(String newName, int newAge, String newGender, int newEnrollment, String newCourse) {
        super(newName, newAge, newGender);
        this.setEnrollment(newEnrollment);
        this.setCourse(newCourse);
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
    
    public void status() {
        System.out.println(
            "\nName: " + this.getName() +
            "\nAge: " + this.getAge() +
            "\nGender: " + this.getGender() +
            "\nEnrollment: " + this.getEnrollment() +
            "\nCourse: " + this.getCourse()
        );
    }
    public void cancelEnrollment() {
        this.setEnrollment(0);
    }
}
