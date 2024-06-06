public class Clock {
    public String color;
    private int hour;
    private int minutes;

    
    public Clock(String newColor, int newHour, int newMinutes) {
        setColor(newColor);
        setHour(newHour);
        setMinutes(newMinutes);
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
    public String getColor() {
        return this.color;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }
    public int getHour() {
        return this.hour;
    }

    public void setMinutes(int newMinutes) {
        this.minutes = newMinutes;
    }
    public int getMinutes() {
        return this.minutes;
    }

    public void status () {
        System.out.println(
            "Color: " + this.getColor() + "\n" +
            "Hour: " + this.getHour() + "\n" +
            "Minutes: " + this.getMinutes()
        );
    }
}
