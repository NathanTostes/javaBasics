public class Workout {

    String muscleGroups[];
    String gym;
    int minutesDuration;
    int progressPercentage;

    void status() {
        System.out.print("Muscle Groups: ");
        for (int count = 0; count < muscleGroups.length; count++){
            System.out.print(muscleGroups[count] + " ");
        }
        System.out.println(
            "\nGym Name: " + this.gym + "\n" +
            "Minutes in Duration: " + this.minutesDuration + "\n" +
            "Progress Percentage: " + this. progressPercentage
        );
    }

    void upProgress(int percentage) {
        this.progressPercentage += percentage;
    }

}