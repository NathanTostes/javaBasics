public class RemoteControler implements Controler {
    private int volume;
    private boolean power;
    private boolean play;
    private boolean menu = false;

    public RemoteControler() {
        this.setVolume(50);
        this.setPower(false);
        this.setPlay(false);
    }

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    public int getVolume() {
        return this.volume;
    }
    public void setPower(boolean newPower){
        this.power = newPower;
    }
    public boolean isPower() {
        return this.power;
    }
    public void setPlay(boolean newPlay){
        this.play = newPlay;
    }
    public boolean isPlay() {
        return this.play;
    }

    public void powerOn() {
        this.setPower(true);
    }
    public void powerOff() {
        this.setPower(false);
    }
    public void openMenu() {
        if (this.isPower() && menu == false) {
            menu = true;
            System.out.print("- - - Menu - - -" + "\n" + "Volume: ");
            for (int count = 0; count < this.getVolume(); count+=10){
                System.out.print("// ");
            }
            System.out.print("\n");
            System.out.println("On: " + this.isPower());
            System.out.println("Play: " + this.isPlay());
        }
    }
    public void closeMenu() {
        if (this.isPower() && menu == true) {
            menu = false;
            System.out.println("- - - Menu Fechado - - -");
        }
    }
    public void increaseVolume() {
        if (this.isPower() && this.getVolume() < 100) 
        this.setVolume(this.getVolume() + 1);
    }
    public void decreaseVolume() {
        if (this.isPower() && this.getVolume() > 0)
        this.setVolume(this.getVolume() - 1);
    }
    public void mute() {
        if (this.isPower() && this.volume > 0)
        this.setVolume(0);
    }
    public void unmute() {
        if (this.isPower() && this.volume == 0) {
            this.setVolume(50);
        }
    }
    public void play() {
        if (this.isPower() && !(this.isPlay()))
        this.setPlay(true);
    }
    public void pause() {
        if (this.isPower() && this.isPlay())
        this.setPlay(false);
    }
}