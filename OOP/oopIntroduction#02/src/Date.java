public class Date {

    String place;
    int meetingTimeHour;
    int meetingTimeMinutes;
    String person1;
    String person2;
    String status;

    void status() {
        System.out.println(
            "Place: " + this.place + "\n" +
            "Meeting time in Minutes: " + this.meetingTimeMinutes + "\n" +
            "Meeting time in Hours: " + this.meetingTimeHour + "\n" +
            "Person 1: " + this.person1 + "\n" +
            "Person 2: " + this.person2 + "\n" +
            "Status: " + this.status + "\n"
        );
    }

    void changeStatus(String newStatus){
        this.status = newStatus;
    }

    void changePlace(String newPlace) {
        this.place = newPlace;
    }

}