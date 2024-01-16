public class App {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Palio";
        car1.color = "Gray";
        car1.kmTraveled = 1300000;
        car1.kmHour = 60;
        car1.tankPercentage = (float) 60.5;
        car1.open = false;

        car1.brake(60);
        car1.open();
        car1.status();
        car1.acelerate(80);
        car1.status();
    }
}
