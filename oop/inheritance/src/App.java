public class App {
    public static void main(String[] args) {
        Student student = new Student("Lucas", 18, "M", 865431, "MAMB");
        Teacher teacher = new Teacher("Alessandra", 53, "F", "MET", 6700.50f);
        Worker worker = new Worker("Cleiton", 32, "M", "Clean");

        student.birthday();
        student.status();
        teacher.salaryIncrease(299.50f);
        teacher.status();
        worker.changeWork();
        worker.status();
    }
}
