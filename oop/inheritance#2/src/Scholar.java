public class Scholar extends Student{
    private boolean scholarship;
    
    public Scholar(String name, int age, String gender, int enrollment, String course) {
        super(name, age, gender, enrollment, course);
        this.setScholarship(true);
    }

    public boolean isScholarship() {
        return scholarship;
    }
    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public void renewScholarship() {
        this.setScholarship(true);
    }
    @Override
    public void montlyPayment() {
        System.out.println(this.getName() + " is a scholarship recipient; he doesn't need to make monthly payments");
    }
}